package com.surabheesinha.donateforgood.Networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by surabheesinha on 10/26/18.
 */

public class ApiClient {


        static final String BASE_URL = "https://api.donorschoose.org/";
        //static final String BASE_URL = "https://www.donorschoose.org/donors/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;

    }


}
