package com.wanou.framelibrary.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Author by wodx521
 * Date on 2018/11/10.
 */
public abstract class BaseMvpActivity<T extends BasePresenter> extends BaseActivity {
    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = getPresenter();
        mPresenter.attachView(this);
        initData();
    }

    //初始化数据
    protected abstract void initData();

    protected abstract T getPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
