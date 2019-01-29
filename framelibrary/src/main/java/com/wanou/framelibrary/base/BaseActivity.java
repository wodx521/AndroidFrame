package com.wanou.framelibrary.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.wanou.framelibrary.manager.ActivityManage;

/**
 * Author by wodx521
 * Date on 2018/11/10.
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseView {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActivityManage.getInstance().addActivity(this);
        setContentView(getResId());
        initView();
    }

    //设置布局id
    protected abstract int getResId();

    //初始化view
    protected abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityManage.getInstance().removeActivity(this);
    }
}
