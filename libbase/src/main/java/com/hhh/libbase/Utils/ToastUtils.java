package com.hhh.libbase.Utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import com.hhh.libbase.ApplicationBase;

/**
 * Toast工具类
 * Created by huhanghao on 2018/1/16.
 */

public class ToastUtils {

    private static Toast mToast;
    private static final Object SYNC_LOCK = new Object();
    public static Context context = ApplicationBase.INSTANCE;

    private static void getInstance() {
        if (mToast == null) {
            synchronized (SYNC_LOCK) {
                if (mToast == null) {
                    mToast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
                }
            }
        }
    }

    public static void showToast(String text) {
        if (context != null && text != null) {
            getInstance();
            mToast.setDuration(Toast.LENGTH_SHORT);
            mToast.setText(text);
            mToast.setGravity(Gravity.CENTER, 0, 0);
            mToast.show();
        }
    }

}
