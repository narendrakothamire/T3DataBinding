package com.softwares.swamisamarth.t3databinding.data;

import com.softwares.swamisamarth.t3databinding.data.remote.WebService;
import com.softwares.swamisamarth.t3databinding.models.LoginRequest;
import com.softwares.swamisamarth.t3databinding.models.LoginResponse;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;
import javax.security.auth.login.LoginException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by C145557 on 9/29/2016.
 */

public class DataManager {

    private WebService webService;
    private EventBus eventBus;

    @Inject
    public DataManager(WebService webService, EventBus eventBus) {
        this.webService = webService;
        this.eventBus = eventBus;
    }

    public void login(LoginRequest loginRequest) {
        Call<LoginResponse> loginResponseCall = webService.employeeLogin(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    eventBus.post(response);
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                    eventBus.post(new LoginResponse.LoginThrowable(t));
            }
        });
    }
}
