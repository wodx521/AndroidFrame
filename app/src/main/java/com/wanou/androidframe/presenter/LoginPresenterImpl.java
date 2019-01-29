package com.wanou.androidframe.presenter;

import com.wanou.androidframe.modle.params.LoginParams;
import com.wanou.androidframe.retrofitutil.RetrofitUtils;
import com.wanou.androidframe.ui.activity.LoginActivity;
import com.wanou.framelibrary.base.BasePresenterImpl;
import com.wanou.framelibrary.utils.GsonUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Author by wodx521
 * Date on 2018/11/12.
 */
public class LoginPresenterImpl extends BasePresenterImpl<LoginActivity> {

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
//                    LoginBean loginBean = (LoginBean) generalResult.data;
//                    mPresenterView.setLoginSuccess(loginBean);
//
//                }
//                if (simpleResponse != null) {
//                    //访问错误的信息解析结果
//                    UiTools.showToast(simpleResponse.msg);
//                    if (simpleResponse.code == -1) {
//                        LogUtils.e("登录超时");
//                    }
//
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
//                LoadingDialog.getDialog(mPresenterView, "");
//            }
//
//            @Override
//            public void onRequestFinish() {
//                LoadingDialog.dismiss();
//            }
//        });
        LoginParams loginParams = GsonUtils.fromJson(json, LoginParams.class);
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("nozzle", loginParams.nozzle);
        stringMap.put("phone", loginParams.phone);
        stringMap.put("password", loginParams.password);

        RetrofitUtils.getEnquene(url, stringMap);
    }


}
