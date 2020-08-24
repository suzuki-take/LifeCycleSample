package com.websarba.wings.android.lifecyclesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LifeCycleMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("LifeCycleSample", "Main onCreate() called.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_main);
    }

    @Override
    public void onStart() {
        Log.i("LifeCycleSample","Main onStart() called.");
        super.onStart();
    }

    @Override
    public void onRestart() {
        Log.i("LifeCycleSample","Main onStart() called.");
        super.onRestart();
    }

    @Override
    public void onResume() {
        Log.i("LifeCycleSample","Main onStart() called.");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("LifeCycleSample","Main onStart() called.");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("LifeCycleSample","Main onStart() called.");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.i("LifeCycleSample","Main onStart() called.");
        super.onDestroy();
    }

    /**
     * 次の画面を表示ボタンがタップされたときの処理
     */
    public void onButtonClick(View view) {
        // インテントオブジェクトを用意
        Intent intent = new Intent(LifeCycleMainActivity.this, LifeCycleSubActivity.class);
        // アクティビティの起動
        startActivity(intent);
    }
}