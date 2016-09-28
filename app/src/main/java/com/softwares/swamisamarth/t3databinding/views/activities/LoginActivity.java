package com.softwares.swamisamarth.t3databinding.views.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softwares.swamisamarth.t3databinding.R;
import com.softwares.swamisamarth.t3databinding.databinding.ActivityLoginBinding;
import com.softwares.swamisamarth.t3databinding.viewmodels.LoginViewModel;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setViewModel(new LoginViewModel());
    }
}
