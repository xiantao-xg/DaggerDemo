package com.solomo.daggerdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;

public abstract class BaseActivity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    //第一步 添加依赖关系
    AndroidInjection.inject(this);
    super.onCreate(savedInstanceState);
  }
}
