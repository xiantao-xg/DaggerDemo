package com.solomo.daggerdemo;

import android.util.Log;

public class Animal {
  private static final String TAG = Animal.class.getSimpleName();
  private Food food;

  public Animal(Food food) {
    this.food = food;
  }

  void eat() {
    Log.d(TAG, "************************ eat ****************************");
  }
}
