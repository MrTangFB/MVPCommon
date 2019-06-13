package com.android.mrt.common.base

import android.app.Application

/**
 * Created by Mr.T on 2018/3/16.
 */
abstract class BaseApplication : Application() {

    /**
     * 初始全局数据
     */
    protected abstract fun init()

    override fun onCreate() {
        super.onCreate()
        init()
    }
}