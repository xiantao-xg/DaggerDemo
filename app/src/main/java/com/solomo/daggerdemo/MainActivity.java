package com.solomo.daggerdemo;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.solomo.daggerdemo.base.BaseActivity;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;

public class MainActivity extends BaseActivity {
  private TextView mTextMessage;

  private static final String TAG = MainActivity.class.getSimpleName();

  // 第二步 使用inject注解，获取到a对象的实力
  @Named("normal animal")
  @Inject
  Animal animal;

  @Named("bad animal")
  @Inject
  Animal badAnimal;

  private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
          = new BottomNavigationView.OnNavigationItemSelectedListener() {

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
      switch (item.getItemId()) {
        case R.id.navigation_home:
          mTextMessage.setText(R.string.title_home);
          return true;
        case R.id.navigation_dashboard:
          mTextMessage.setText(R.string.title_dashboard);
          return true;
        case R.id.navigation_notifications:
          mTextMessage.setText(R.string.title_notifications);
          return true;
      }
      return false;
    }
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    BottomNavigationView navView = findViewById(R.id.nav_view);
    mTextMessage = findViewById(R.id.message);
    navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    Log.d(TAG, "first eat");
    animal.eat();
    Log.d(TAG, "second eat");
    badAnimal.eat();
  }

}
