package com.wanou.androidframe.ui.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.wanou.androidframe.R;
import com.wanou.androidframe.constant.UrlConstant;
import com.wanou.androidframe.modle.LoginBean;
import com.wanou.androidframe.modle.params.LoginParams;
import com.wanou.androidframe.presenter.FirstPresenterImpl;
import com.wanou.framelibrary.base.BaseMvpFragment;
import com.wanou.framelibrary.glidetools.GlideUtils;
import com.wanou.framelibrary.utils.GsonUtils;
import com.wanou.framelibrary.utils.LogUtils;
import com.wanou.framelibrary.utils.UiTools;

/**
 * Author by wodx521
 * Date on 2018/11/10.
 */
public class FirstMainFragment extends BaseMvpFragment<FirstPresenterImpl> {
    private Button mBtJump;
    private EditText mEtPhone;
    private EditText mEtPass;
    private TextView mTvForgetPass;
    private TextView mTvSignUp;
    private ImageView mIvImage;
    private LoginParams loginParams = new LoginParams();

    @Override
    protected int getResId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView(View view) {
        mIvImage = view.findViewById(R.id.iv_image);
        mEtPhone = view.findViewById(R.id.et_phone);
        mEtPass = view.findViewById(R.id.et_pass);
        mTvForgetPass = view.findViewById(R.id.tv_forget_pass);
        mTvSignUp = view.findViewById(R.id.tv_sign_up);
        mBtJump = view.findViewById(R.id.bt_sign_in);
    }

    @Override
    protected void initData() {
        LogUtils.e("创建了第一个fragment");

        mBtJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        });
        String imageUrl = "http://www.sccnn.com/add/so6.jpg";
        GlideUtils.intoImage(imageUrl, R.drawable.place, R.drawable.load_fail,0, mIvImage);
    }

    @Override
    protected void isHiddenListener(boolean hidden) {
        if (hidden) {
            LogUtils.e("第一个fragment隐藏了");
        } else {
            LogUtils.e("第一个fragment显示了");
        }
    }

    @Override
    protected FirstPresenterImpl getPresenter() {
        return new FirstPresenterImpl();
    }

    public void setLoginSuccess(LoginBean data) {
        LogUtils.e(data.getToken());
    }
}
