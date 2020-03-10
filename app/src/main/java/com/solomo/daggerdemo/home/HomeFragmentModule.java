package com.solomo.daggerdemo.home;

import com.solomo.daggerdemo.Animal;
import com.solomo.daggerdemo.Food;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

// 第一步添加module注解
@Module
public class HomeFragmentModule {
  // 第二步 使用provider注解 实例化对象
  @Provides
  Animal providerAnimal(Food food) {
    return new Animal(food);
  }

  @Provides
  Food providerFood() {
    return new Food();
  }
}
