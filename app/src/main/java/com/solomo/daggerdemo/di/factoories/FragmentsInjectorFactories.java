package com.solomo.daggerdemo.di.factoories;

import android.support.v4.app.Fragment;

import com.solomo.daggerdemo.home.HomeFragment;
import com.solomo.daggerdemo.home.HomeFragmentSubcomponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * @author: leellun
 * @data: 2018/12/21.
 */
//        register your fragments' subcomponents here
@Module(subcomponents = {HomeFragmentSubcomponent.class, })
public abstract class FragmentsInjectorFactories {
  //TODO bind your fragments' injection factories here

  @Binds
  @IntoMap
  @FragmentKey(HomeFragment.class)
  public abstract AndroidInjector.Factory<? extends Fragment> bindMineFragmentInjectorFactory(HomeFragmentSubcomponent.Builder builder);
}