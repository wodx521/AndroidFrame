package com.wanou.androidframe.ui.fragment;

import android.view.View;

import com.wanou.androidframe.R;
import com.wanou.framelibrary.base.BaseFragment;
import com.wanou.framelibrary.utils.LogUtils;

/**
 * Author by wodx521
 * Date on 2018/11/10.
 */
public class FiveMainFragment extends BaseFragment {
    @Override
    protected int getResId() {
        return R.layout.fragment_five_main;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initData() {
        LogUtils.e("创建了第五个fragment");
    }


    @Override
    protected void isHiddenListener(boolean hidden) {
        if (hidden) {
            LogUtils.e("第五个fragment隐藏了");
        }else{
            LogUtils.e("第五个fragment显示了");
        }
    }
}
