package com.wanou.androidframe.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wanou.androidframe.R;
import com.wanou.framelibrary.utils.CountDownUtils;

/**
 * Author by wodx521
 * Date on 2018/11/9.
 */
public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        CountDownUtils.getTimer(3, null, "");
        CountDownUtils.setTimeFinishListener(new CountDownUtils.CountTimeFinishListener() {
            @Override
            public void onTimeFinishListener() {
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        CountDownUtils.cancelTimer();
    }
}
