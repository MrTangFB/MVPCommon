package com.android.mrt.common.base

import android.content.Context

/**
 * Created by Mr.T on 2018/3/17.
 */
abstract class BaseMvpModel {

    protected var mContext: Context? = null

    /**
     * 勿手动调用
     */
    fun onCreate(context: Context?) {
        mContext = context
    }

    /**
     * 勿手动调用
     */
    fun onDestroy() {
        mContext = null
    }
}