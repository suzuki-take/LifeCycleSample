package com.websarba.wings.android.lifecyclesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LifeCycleSubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycleSample", "Sub onCreate() called.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_sub);
    }

    @Override
    public void onStart() {
        Log.i("LifeCycleSample","Sub onStart() called.");
        super.onStart();
    }

    @Override
    public void onRestart() {
        Log.i("LifeCycleSample","Sub onStart() called.");
        super.onRestart();
    }

    @Override
    public void onResume() {
        Log.i("LifeCycleSample","Sub onStart() called.");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("LifeCycleSample","Sub onStart() called.");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("LifeCycleSample","Sub onStart() called.");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.i("LifeCycleSample","Sub onStart() called.");
        super.onDestroy();
    }

    /**
     * 前の画面表示ボタンがタップされたときの処理
     */
    public void onButtonClick(View view) {
        // このアクティビティの終了
        finish();
    }
}