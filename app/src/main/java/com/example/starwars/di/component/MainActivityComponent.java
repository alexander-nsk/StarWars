package com.example.starwars.di.component;

import android.content.Context;

import com.example.starwars.ui.MainActivity;
import com.example.starwars.di.module.AdapterModule;
import com.example.starwars.di.qualifiers.ActivityContext;
import com.example.starwars.di.scopes.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = AdapterModule.class, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {

    @ActivityContext
    Context getContext();

    void injectMainActivity(MainActivity mainActivity);
}