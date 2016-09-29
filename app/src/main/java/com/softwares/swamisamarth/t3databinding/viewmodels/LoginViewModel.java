package com.softwares.swamisamarth.t3databinding.viewmodels;

import android.content.Context;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.widget.Toast;

import com.softwares.swamisamarth.t3databinding.BR;
import com.softwares.swamisamarth.t3databinding.data.DataManager;
import com.softwares.swamisamarth.t3databinding.models.LoginRequest;
import com.softwares.swamisamarth.t3databinding.models.LoginResponse;
import com.softwares.swamisamarth.t3databinding.utils.Utility;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import javax.inject.Inject;

import retrofit2.Response;

/**
 * Created by C145557 on 9/28/2016.
 */

public class LoginViewModel extends BaseViewModel {

    private Context context;
    private String userName;
    private String password;
    private DataManager dataManager;


    public LoginViewModel(Context context, DataManager dataManager, EventBus eventBus){
        this.context = context;
        this.dataManager = dataManager;
        eventBus.register(this);

    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    public void performLogin(){
        if(validateFields()){
            LoginRequest loginRequest = new LoginRequest();
            loginRequest.setEmployeeId(userName);
            loginRequest.setPassword(password);
            dataManager.login(loginRequest);
        }
    }

    public boolean validateFields(){
        if(userName == null || userName.trim().isEmpty()){
          //  Toast.makeText(context, "Enter username", Toast.LENGTH_LONG).show();
            Utility.showToast(context, "Enter username");
            return false;
        }else if(password == null || password.trim().isEmpty()){
            Toast.makeText(context, "Enter password", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    @Subscribe
    public void onEvent(Response<LoginResponse> loginResponse){
        Toast.makeText(context, "got response", Toast.LENGTH_LONG).show();
    }

    @Subscribe
    public void onEvent(LoginResponse.LoginThrowable loginThrowable){
        Toast.makeText(context, "got error", Toast.LENGTH_LONG).show();
    }
}
