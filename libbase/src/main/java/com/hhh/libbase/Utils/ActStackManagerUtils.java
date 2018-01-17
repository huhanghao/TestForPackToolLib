package com.hhh.libbase.Utils;

import android.app.Activity;

import java.util.Stack;

/**
 * Created by gongjiangpeng on 15/11/30.
 */
public class ActStackManagerUtils {

    /**
     * activity栈.
     */
    private static Stack<Activity> activityStack;
    /**
     * 单例.
     */
    private static ActStackManagerUtils instance;

    private ActStackManagerUtils() {
    }

    /**
     * 获取管理类.
     *
     * @return 屏幕管理类.
     */
    public static ActStackManagerUtils getScreenManager() {
        if (instance == null) {
            instance = new ActStackManagerUtils();
        }
        return instance;
    }

    /**
     * 移除传入的activity.
     *
     * @param activity 需要移除的activity.
     */
    public void popActivity(Activity activity) {
        if (activity != null) {
            activity.finish();
            activityStack.remove(activity);
        }
    }

    /**
     * 获取当前activity.
     *
     * @return 当前正栈中顶层activity.
     */
    public Activity currentActivity() {
        Activity activity;
        try {
            activity = activityStack.lastElement();
        } catch (Exception e) {
            activity = null;
        }
        return activity;
    }

    /**
     * 清空栈.
     */
    public void clearStacks() {
        while (!activityStack.empty()) {
            final Activity activity = activityStack.pop();
            activity.finish();
        }
    }

    /**
     * 持续关闭activity一直到特定name的activity.
     *
     * @param name activity的名字.
     */
    public void closeUntilThisActivity(String name) {
        while (!activityStack.empty()) {
            final Activity activity = activityStack.pop();
            if (name.equals(activity.getClass().getSimpleName())) {
                activityStack.push(activity);
                break;
            } else {
                activity.finish();
            }
        }
    }

    /**
     * 存入activity.
     *
     * @param activity 当前打开的activity.
     */
    public void pushActivity(Activity activity) {
        if (activityStack == null) {
            activityStack = new Stack<>();
        }
        activityStack.add(activity);
    }
}