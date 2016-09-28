package com.softwares.swamisamarth.t3databinding.injection.module;

import android.app.Application;
import android.content.Context;

import com.softwares.swamisamarth.t3databinding.data.remote.WebService;
import com.softwares.swamisamarth.t3databinding.injection.ApplicationContext;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by C145557 on 9/28/2016.
 */

@Module
public class ApplicationModule {
    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    EventBus provideEventBus() {
        return new EventBus();
    }

    @Provides
    @Singleton
    WebService provideRibotService() {
        return WebService.WebServiceFactory.makeWebService(mApplication);
    }
}
