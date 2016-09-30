package com.softwares.swamisamarth.t3databinding.views.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softwares.swamisamarth.t3databinding.R;
import com.softwares.swamisamarth.t3databinding.views.fragments.DashboardFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new DashboardFragment(), DashboardFragment.class.getSimpleName())
                .commit();
    }
}
