package com.solomo.daggerdemo.home;

import com.solomo.daggerdemo.MainActivity;
import com.solomo.daggerdemo.MainModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = HomeFragmentModule.class)
public interface HomeFragmentSubcomponent extends AndroidInjector<HomeFragment> {
  @Subcomponent.Builder
  public abstract class Builder extends AndroidInjector.Builder<HomeFragment> {}
}
