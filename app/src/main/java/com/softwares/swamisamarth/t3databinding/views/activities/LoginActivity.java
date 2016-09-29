package com.softwares.swamisamarth.t3databinding.views.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softwares.swamisamarth.t3databinding.R;
import com.softwares.swamisamarth.t3databinding.T3Application;
import com.softwares.swamisamarth.t3databinding.data.DataManager;
import com.softwares.swamisamarth.t3databinding.databinding.ActivityLoginBinding;
import com.softwares.swamisamarth.t3databinding.injection.component.ApplicationComponent;
import com.softwares.swamisamarth.t3databinding.viewmodels.LoginViewModel;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    LoginViewModel loginViewModel;

    @Inject
    DataManager dataManager;

    @Inject
    EventBus eventBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        T3Application application = (T3Application) getApplicationContext();
        application.getApplicationComponent().inject(this);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setViewModel(new LoginViewModel(this, dataManager, eventBus));
    }


}
