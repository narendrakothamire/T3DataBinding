package com.softwares.swamisamarth.t3databinding.data.remote;

import android.app.Application;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by C145557 on 9/28/2016.
 */

public interface WebService {


    String ENDPOINT = "";

    class WebServiceFactory{

        public static WebService makeWebService(Application application){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(WebService.ENDPOINT)
                //    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(new Gson()))
                    .build();
            return retrofit.create(WebService.class);
        }

    }
}
