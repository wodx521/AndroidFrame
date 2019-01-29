package com.wanou.androidframe.ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.wanou.androidframe.R;
import com.wanou.androidframe.constant.UrlConstant;
import com.wanou.androidframe.modle.LoginBean;
import com.wanou.androidframe.modle.params.LoginParams;
import com.wanou.androidframe.presenter.LoginPresenterImpl;
import com.wanou.framelibrary.base.BaseMvpActivity;
import com.wanou.framelibrary.utils.GsonUtils;
import com.wanou.framelibrary.utils.UiTools;

/**
 * Author by wodx521
 * Date on 2018/11/12.
 */
public class LoginActivity extends BaseMvpActivity<LoginPresenterImpl> implements View.OnClickListener {
    private EditText mEtPhone;
    private EditText mEtPass;
    private TextView mTvForgetPass;
    private TextView mTvSignUp;
    private Button mBtSignIn;
    private LoginParams loginParams = new LoginParams();

    @Override
    protected LoginPresenterImpl getPresenter() {
        return new LoginPresenterImpl();
    }

    @Override
    protected int getResId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        mEtPhone = findViewById(R.id.et_phone);
        mEtPass = findViewById(R.id.et_pass);
        mTvForgetPass = findViewById(R.id.tv_forget_pass);
        mTvSignUp = findViewById(R.id.tv_sign_up);
        mBtSignIn = findViewById(R.id.bt_sign_in);

        mBtSignIn.setOnClickListener(this);
    }

    @Override
    protected void initData() {


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_sign_in:
                String phone = mEtPhone.getText().toString().trim();
                String pass = mEtPass.getText().toString().trim();
                if (UiTools.isEmpty(phone, pass)) {
                    loginParams.nozzle = "login";
                    loginParams.phone = phone;
                    loginParams.password = pass;
                    String json = GsonUtils.toJson(loginParams);
                    mPresenter.loginAccount(UrlConstant.BASE_URL, json);
                } else {
                    UiTools.showToast("请输入用户名和密码");
                }
                break;
        }
    }

    public void setLoginSuccess(LoginBean data) {
        MainActivity.startActivity(this);
        finish();
    }
}
