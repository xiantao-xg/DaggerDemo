package com.solomo.daggerdemo.di.modules;

import com.solomo.daggerdemo.AppSingleton;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

  @Singleton
  @Provides
  AppSingleton provideAppSingleton() {
    return new AppSingleton();
  }
}
