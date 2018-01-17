package com.hhh.libbase.Utils;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by huhanghao on 2018/1/17.
 */

public class ThreadPoolManager {

    private static final Object LOCK = new Object();
    private static ThreadPoolManager mInstance;
    private ThreadPoolExecutor mExecutor;

    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private final static int CORE_POOL_SIZE = CPU_COUNT + 1;
    private final static int MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
    private final static int KEEP_ALIVE_TIME = 30;

    public static ThreadPoolManager getInstance() {
        synchronized (LOCK){
            if(mInstance == null){
                mInstance = new ThreadPoolManager();
            }
            return mInstance;
        }
    }

    /**
     * 添加一个任务到线程池
     * @param runnable
     */
    public void execute(Runnable runnable){
        if(runnable == null) return;

        if(mExecutor == null || mExecutor.isShutdown()){
            mExecutor = new ThreadPoolExecutor(
                    CORE_POOL_SIZE,
                    MAXIMUM_POOL_SIZE,
                    KEEP_ALIVE_TIME,
                    TimeUnit.SECONDS,
                    new LinkedBlockingDeque<Runnable>(),
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());
        }
        mExecutor.execute(runnable);
    }

    /**
     * 将线程从线程池移除
     * @param runnable
     */
    public void remove(Runnable runnable){
        if(runnable != null){
            mExecutor.remove(runnable);
        }
    }

}
