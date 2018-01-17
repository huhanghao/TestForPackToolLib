package com.hhh.libbase.Utils;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

import com.hhh.libbase.ApplicationBase;

/**
 * Created by huhanghao on 2018/1/16.
 */

public class DensityUtils {

    private static Resources sResouces = ApplicationBase.INSTANCE.getResources();

    /**
     * dp转px
     *
     * @param dpVal
     * @return
     */
    public static float dp2px(float dpVal) {
        DisplayMetrics metrics = sResouces.getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpVal, metrics);
    }

    /**
     * sp转px
     *
     * @param spVal
     * @return
     */
    public static int sp2px(float spVal) {
        DisplayMetrics metrics = sResouces.getDisplayMetrics();
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spVal, metrics);
    }

    /**
     * px转dp
     *
     * @param pxVal
     * @return
     */
    public static float px2dp(float pxVal) {
        DisplayMetrics metrics = sResouces.getDisplayMetrics();
        final float scale = metrics.density;
        return (pxVal / scale);
    }

    /**
     * px转sp
     *
     * @param pxVal
     * @return
     */
    public static float px2sp(float pxVal) {
        DisplayMetrics metrics = sResouces.getDisplayMetrics();
        return (pxVal / metrics.scaledDensity);
    }
}
