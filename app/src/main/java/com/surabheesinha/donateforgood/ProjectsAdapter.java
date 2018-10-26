package com.surabheesinha.donateforgood;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.surabheesinha.donateforgood.Model.ProjectsModel;

import java.util.ArrayList;

/**
 * Created by surabheesinha on 10/26/18.
 */

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ViewHolder>{

    ArrayList<ProjectsModel> pmodels ;
    int rowlayout;
    Context context;
    //public ProjectsAdapter(ArrayList<ProjectsModel> pmodles, int rowlayout, Context context)
    //{
    //    this.pmodels = pmodels;
    //    this.rowlayout = rowlayout;
    //    this.context = context;
    //}
    public ProjectsAdapter(ArrayList<ProjectsModel> pmodles)
    {
        this.pmodels = pmodels;

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        public ViewHolder(View itemView){
            super(itemView);
            title = itemView.findViewById(R.id.title);

        }

    }




    @Override
    public ProjectsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProjectsAdapter.ViewHolder holder, int position) {
        holder.title.setText(pmodels.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}