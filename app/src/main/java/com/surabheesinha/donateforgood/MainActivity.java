package com.surabheesinha.donateforgood;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.MenuItem;

import com.surabheesinha.donateforgood.Model.JsonRespProposal;
import com.surabheesinha.donateforgood.Model.ProjectsModel;
import com.surabheesinha.donateforgood.Networking.ApiClient;
import com.surabheesinha.donateforgood.Networking.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    ProjectsAdapter madapter;
    //DisplayAdapter dAdapter;
    RecyclerView recyclerView;
    SearchView searchView;
    MenuItem menuItem;
    ProjectsModel projModels;
    String newQuery;
    Context context;
    private ArrayList<ProjectsModel> proejctdata;
    String apiKey = "DONORSCHOOSE";
    String jsonfeedHtml = "json_feed.html?";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recView);
        //madapter = new MovieAdapter(movieList);
        //dAdapter = new DisplayAdapter(movieList);
        final RecyclerView.LayoutManager layoutmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);
        LoadJsonData();


    }
    public void LoadJsonData(){
        final ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        //final Call<JsonRespProposal> call = apiInterface.getAllData(apiKey);
        final Call<JsonRespProposal> call = apiInterface.getAllDataTrial(apiKey);
        //final Call<JsonRespProposal> call = apiInterface.getAllDataTrial2("NC",apiKey);
        call.enqueue(new Callback<JsonRespProposal>() {


            @Override
            public void onResponse(Call<JsonRespProposal> call, Response<JsonRespProposal> response) {
                //List<JsonRespProposal> people = response.body().getProposals();

                //Log.e(response.toString(), "response next url");
                //PeopleAdapter mvadapter = new PeopleAdapter(people, R.layout.rec_row_layout, getApplicationContext());
                //Log.e(response.toString(),"People I A m ");
                JsonRespProposal jsonResponse = response.body();
                Log.d("Response",response.toString());
                Log.d("Response",jsonResponse.toString());
                //proejctdata = new ArrayList<>(Arrays.asList(jsonResponse.getProposals()));
                madapter = new ProjectsAdapter(proejctdata);
                recyclerView.setAdapter(madapter);

            }

            @Override
            public void onFailure(Call<JsonRespProposal> call, Throwable t) {
                Log.d("Error",t.getMessage());

            }
        });
    }
}
