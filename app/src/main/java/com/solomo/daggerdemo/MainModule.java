package com.solomo.daggerdemo;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

// 第一步添加module注解
@Module
public class MainModule {
  // 第二步 使用provider注解 实例化对象
  @Named("normal animal")
  @Provides
  Animal providerAnimal(Food food) {
    return new Animal(food);
  }

  @Named("bad animal")
  @Provides
  Animal provideBadAnimal(Food food) {
    return new Animal(food);
  }

  @Provides
  Food providerFood() {
    return new Food();
  }
}
