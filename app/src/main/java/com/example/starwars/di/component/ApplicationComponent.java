package com.example.starwars.di.component;

import android.content.Context;

import com.example.starwars.MyApplication;
import com.example.starwars.di.module.ContextModule;
import com.example.starwars.di.module.RetrofitModule;
import com.example.starwars.di.qualifiers.ApplicationContext;
import com.example.starwars.di.scopes.ApplicationScope;
import com.example.starwars.retrofit.APIInterface;

import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {

    public APIInterface getApiInterface();

    @ApplicationContext
    public Context getContext();

    public void injectApplication(MyApplication myApplication);
}
