package com.softwares.swamisamarth.t3databinding.data.remote;

import android.app.Application;

import com.google.gson.Gson;
import com.softwares.swamisamarth.t3databinding.models.LoginRequest;
import com.softwares.swamisamarth.t3databinding.models.LoginResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by C145557 on 9/28/2016.
 */

public interface WebService {


    String ENDPOINT = "http://ttavatar.iifl.in/BackOfficeWebApi/api/";

    @POST("BackOffice/EmployeeLoginV1")
    Call<LoginResponse> employeeLogin(@Body LoginRequest loginRequest);


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
