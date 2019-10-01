package com.example.starwars.di.component;

import com.example.starwars.di.scopes.ActivityScope;
import com.example.starwars.ui.DetailActivity;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class)
@ActivityScope
public interface DetailActivityComponent {

    void inject(DetailActivity detailActivity);
}
