package com.solomo.daggerdemo;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = MainModule.class)
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
  @Subcomponent.Builder
  public abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
