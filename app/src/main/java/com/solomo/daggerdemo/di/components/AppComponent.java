package com.solomo.daggerdemo.di.components;


import com.solomo.daggerdemo.MyApp;
import com.solomo.daggerdemo.di.factoories.ActivitiesInjectorFactories;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidSupportInjectionModule.class, ActivitiesInjectorFactories.class})
public interface AppComponent {

  void inject(MyApp app);
}
