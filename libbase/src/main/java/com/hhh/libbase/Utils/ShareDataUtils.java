package com.hhh.libbase.Utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.hhh.libbase.ApplicationBase;

/**
 * sp工具类
 * Created by huhanghao on 2018/1/16.
 */
public class ShareDataUtils {

    public static SharedPreferences sp;
    private static final String SP_NAME = "hhh";

    /*sp存储的关键字key*/
    public static final String PHONE = "phone";
    public static final String PASSWORD = "password";

    public static void init() {
        if (sp == null) {
            sp = ApplicationBase.INSTANCE.getSharedPreferences(SP_NAME, ApplicationBase.INSTANCE.MODE_PRIVATE);
        }
    }

    /**
     * 是否为null
     *
     * @return
     */
    public static boolean isNull() {
        return sp == null;
    }

    /**
     * 移除某个key值已经对应的值
     *
     * @param context
     * @param key
     */
    public static void remove(Context context, String key) {
        SharedPreferences.Editor editor = sp.edit();
        editor.remove(key);
        editor.apply();
    }

    /**
     * 清除所有数据
     *
     * @param context
     */
    public static void clear(Context context) {

        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.apply();
    }

    /**
     * 查询某个key是否已经存在
     *
     * @param context
     * @param key
     * @return
     */
    public static boolean contains(Context context, String key) {
        return sp.contains(key);
    }


    // 存储和获取数据
    public static int getShareIntData(String key) {
        return sp.getInt(key, 0);
    }

    public static int getShareIntData(String key, int defaultValue) {
        return sp.getInt(key, defaultValue);
    }

    public static void setShareIntData(String key, int value) {
        sp.edit().putInt(key, value).apply();
    }

    public static String getShareStringData(String key) {
        return sp.getString(key, "");
    }

    public static String getShareStringData(String key, String defaultValue) {
        return sp.getString(key, defaultValue);
    }

    public static void setShareStringData(String key, String value) {
        sp.edit().putString(key, value).apply();
    }

    public static boolean getShareBooleanData(String key) {
        return sp.getBoolean(key, false);
    }

    public static boolean getShareBooleanData(String key, boolean defaultValue) {
        return sp.getBoolean(key, defaultValue);
    }

    public static void setShareBooleanData(String key, boolean value) {
        sp.edit().putBoolean(key, value).apply();
    }


    public static float getShareFloatData(String key) {
        return sp.getFloat(key, 0f);
    }

    public static float getShareFloatData(String key, Float defaultValue) {
        return sp.getFloat(key, defaultValue);
    }


    public static void setShareFloatData(String key, float value) {
        sp.edit().putFloat(key, value).apply();
    }

    public static long getShareLongData(String key) {
        return sp.getLong(key, 0l);
    }

    public static long getShareLongData(String key, Long defaultValue) {
        return sp.getLong(key, defaultValue);
    }

    public static void setShareLongData(String key, long value) {
        sp.edit().putLong(key, value).apply();
    }


}
