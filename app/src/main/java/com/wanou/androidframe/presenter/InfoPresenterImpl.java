package com.wanou.androidframe.presenter;

import com.wanou.androidframe.ui.activity.InfoActivity;
import com.wanou.framelibrary.base.BasePresenterImpl;
import com.wanou.framelibrary.utils.LogUtils;

/**
 * Author by wodx521
 * Date on 2018/11/10.
 */
public class InfoPresenterImpl extends BasePresenterImpl<InfoActivity> {
    // TODO: 2018/11/10 此类里面写具体的方法包括访问数据等
    // TODO: 2018/11/10 可以拿到activity类,所以已经持有了对象,可进行调用操作
    public void account() {
        LogUtils.e("打开了页面");
    }

}
