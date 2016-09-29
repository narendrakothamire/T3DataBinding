package com.softwares.swamisamarth.t3databinding;

import android.app.Application;

import com.softwares.swamisamarth.t3databinding.injection.component.ApplicationComponent;
import com.softwares.swamisamarth.t3databinding.injection.component.DaggerApplicationComponent;
import com.softwares.swamisamarth.t3databinding.injection.module.ApplicationModule;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

/**
 * Created by C145557 on 9/29/2016.
 */

public class T3Application extends Application {

    private ApplicationComponent applicationComponent;

    @Inject
    EventBus eventBus;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        applicationComponent.inject(this);
   //     eventBus.register(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
