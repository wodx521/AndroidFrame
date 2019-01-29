package com.wanou.androidframe.dialogpackage;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.wanou.androidframe.R;
import com.wanou.framelibrary.manager.DialogManager;
import com.wanou.framelibrary.utils.UiTools;


/**
 * @author wodx521
 * @date on 2018/9/1
 */
public class LoadingDialog {
    private static AlertDialog alertDialog;

    public static void getDialog(Activity activity, String loadingContent) {
        alertDialog = new AlertDialog.Builder(activity).create();
        DialogManager.DIALOG_MANAGER.addDialog(alertDialog);
        View view = UiTools.parseLayout(R.layout.loading_dialog, null);
        TextView mTvLoadingContent = view.findViewById(R.id.tv_loading_content);
        if (!TextUtils.isEmpty(loadingContent)) {
            mTvLoadingContent.setText(loadingContent);
        } else {
            mTvLoadingContent.setText(R.string.loading);
        }
        alertDialog.setView(view);
        alertDialog.setCancelable(true);
        alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        alertDialog.show();
        WindowManager.LayoutParams attributes = alertDialog.getWindow().getAttributes();
        int deviceWidth = UiTools.getDeviceWidth(activity);
        attributes.width = deviceWidth / 3;
        alertDialog.getWindow().setAttributes(attributes);
    }

    public static void dismiss() {
        DialogManager.DIALOG_MANAGER.dismissDialog(alertDialog);
    }
}
