package com.wanou.androidframe.presenter;

import com.wanou.androidframe.ui.fragment.FirstMainFragment;
import com.wanou.framelibrary.base.BasePresenterImpl;

/**
 * Author by wodx521
 * Date on 2018/11/13.
 */
public class FirstPresenterImpl extends BasePresenterImpl<FirstMainFragment> {

    public void loginAccount(String url, String json) {
//        OkGoUtils.postRequest(url, "login", json, new CustomizeStringCallback() {
//            @Override
//            public GeneralResult getGeneralResult(String result) {
//                return GsonUtils.fromJson(result, new TypeToken<GeneralResult<LoginBean>>() {
//                }.getType());
//            }
//
//            @Override
//            public void onRequestSuccess(SimpleResponse simpleResponse, GeneralResult generalResult) {
//                if (generalResult != null) {
//                    //成功解析后的数据
//                    LoginBean data = (LoginBean) generalResult.data;
//                    LoginParams loginParams = GsonUtils.fromJson(json, LoginParams.class);
//
//                    mPresenterView.setLoginSuccess(data);
//                }
//                if (simpleResponse != null) {
//                    //访问错误的信息解析结果
//                    UiTools.showToast(simpleResponse.msg);
//                    if (simpleResponse.code == -1) {
//                        LogUtils.e("登录超时");
//                    }
//                }
//            }
//
//            @Override
//            public void onRequestError(Throwable exception) {
//                LogUtils.e("访问失败");
//            }
//
//            @Override
//            public void onRequestStart(Request<String, ? extends Request> request) {
//                LoadingDialog.getDialog(mPresenterView.getActivity(), "");
//            }
//
//            @Override
//            public void onRequestFinish() {
//                LoadingDialog.dismiss();
//            }
//        });
    }
}
