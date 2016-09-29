package com.softwares.swamisamarth.t3databinding.injection.component;

import com.softwares.swamisamarth.t3databinding.T3Application;
import com.softwares.swamisamarth.t3databinding.injection.module.ApplicationModule;
import com.softwares.swamisamarth.t3databinding.views.activities.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by C145557 on 9/28/2016.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(LoginActivity loginActivity);
    void inject(T3Application t3Application);
}
