package com.hhh.libbase;

import android.content.Context;

/**
 * Created by huhanghao on 2017/7/19.
 */

public class ApplicationBase {

    public static Context INSTANCE;

    public static void initApplicationBase(Context mContext) {
        INSTANCE = mContext;
    }
}
