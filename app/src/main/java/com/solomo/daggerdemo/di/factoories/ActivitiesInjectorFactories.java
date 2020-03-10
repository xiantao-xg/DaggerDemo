package com.solomo.daggerdemo.di.factoories;

import android.app.Activity;

import com.solomo.daggerdemo.MainActivity;
import com.solomo.daggerdemo.MainActivitySubcomponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;


/**
 *
 *
 */
@Module(subcomponents = {MainActivitySubcomponent.class})
public abstract class ActivitiesInjectorFactories {
  //TODO bind your activities' injection factories here
  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  public abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(
      MainActivitySubcomponent.Builder builder);

}