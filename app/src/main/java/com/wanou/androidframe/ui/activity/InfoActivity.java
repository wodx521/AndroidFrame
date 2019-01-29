package com.wanou.androidframe.ui.activity;

import com.wanou.androidframe.R;
import com.wanou.androidframe.presenter.InfoPresenterImpl;
import com.wanou.framelibrary.base.BaseMvpActivity;

/**
 * Author by wodx521
 * Date on 2018/11/10.
 */
public class InfoActivity extends BaseMvpActivity<InfoPresenterImpl> {

    @Override
    protected int getResId() {
        return R.layout.activity_info;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        mPresenter.account();
    }

    @Override
    protected InfoPresenterImpl getPresenter() {
        return new InfoPresenterImpl();
    }
}
