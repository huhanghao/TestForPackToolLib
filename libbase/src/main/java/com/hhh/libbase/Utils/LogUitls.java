package com.hhh.libbase.Utils;

import android.util.Log;

import com.hhh.libbase.LibBaseConstants;
import com.hhh.libbase.LibBaseControlUnit;

/**
 * log工具类
 * Created by huhanghao on 2018/1/16.
 */

public class LogUitls {

    // 下面四个是默认tag的函数
    public static void i(String msg) {
        if (LibBaseControlUnit.IsShowLog)
            Log.i(LibBaseConstants.TOKEN, msg);
    }

    public static void d(String msg) {
        if (LibBaseControlUnit.IsShowLog)
            Log.d(LibBaseConstants.TOKEN, msg);
    }

    public static void e(String msg) {
        if (LibBaseControlUnit.IsShowLog)
            Log.e(LibBaseConstants.TOKEN, msg);
    }

    public static void v(String msg) {
        if (LibBaseControlUnit.IsShowLog)
            Log.v(LibBaseConstants.TOKEN, msg);
    }

    // 下面是传入自定义tag的函数
    public static void i(String tag, String msg) {
        if (LibBaseControlUnit.IsShowLog)
            Log.i(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (LibBaseControlUnit.IsShowLog)
            Log.i(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (LibBaseControlUnit.IsShowLog)
            Log.i(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (LibBaseControlUnit.IsShowLog)
            Log.i(tag, msg);
    }
}
