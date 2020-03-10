package com.solomo.daggerdemo.di.components;


import com.solomo.daggerdemo.MyApp;
import com.solomo.daggerdemo.di.factoories.ActivitiesInjectorFactories;
import com.solomo.daggerdemo.di.factoories.FragmentsInjectorFactories;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidSupportInjectionModule.class,
        ActivitiesInjectorFactories.class,
        FragmentsInjectorFactories.class})
public interface AppComponent {

  void inject(MyApp app);
}
