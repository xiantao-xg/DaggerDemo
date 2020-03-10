package com.solomo.daggerdemo;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import com.solomo.daggerdemo.di.components.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MyApp extends Application implements HasActivityInjector, HasSupportFragmentInjector {

  @Inject
  DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

  @Inject
  DispatchingAndroidInjector<Fragment> dispatchingAndroidFragmentInjector;

  @Override
  public void onCreate() {
    super.onCreate();
    DaggerAppComponent.create().inject(this);
  }

  @Override
  public DispatchingAndroidInjector<Activity> activityInjector() {
    return dispatchingActivityInjector;
  }

  @Override
  public AndroidInjector<Fragment> supportFragmentInjector() {
    return dispatchingAndroidFragmentInjector;
  }
}
