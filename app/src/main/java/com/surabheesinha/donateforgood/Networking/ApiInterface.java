package com.surabheesinha.donateforgood.Networking;

import com.surabheesinha.donateforgood.Model.JsonRespProposal;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by surabheesinha on 10/26/18.
 */

public interface ApiInterface {
    @GET("APIKey")
    Call<JsonRespProposal> getAllData(@Url String apiKey);

    //http://api.donorschoose.org/common/json_feed.html?APIKey=DONORSCHOOSE
    //@GET("/user/{username}?type={admin}")
    //Here username is the path variable, and admin is the query variable
    //@GET("/user/{username}?type={admin}")
    //void getUserOuth(@Path("username") String username, @Query("admin") String type)

   // @GET("/{jsonfeedHtml}&APIKey={APIKey}")
    //Call<JsonRespProposal> getAllDataTrial(@Path("json_feed.html") String json_feedHtml,@Url String apikey  );

     @GET("/common/json_feed.html?")
    Call<JsonRespProposal> getAllDataTrial(@Query("APIKey") String key);
    @GET("/json_feed.html?")
    Call<JsonRespProposal> getAllDataTrial2(@Query("state") String state,@Query("APIKey") String key);



    @GET("keywords")
    Call<JsonRespProposal> getSearchedPorject(@Query("search") String searchProjects);
}
