package com.android.mrt.common.util

import android.util.Log

/**
 * Created by Mr.T on 2018/3/16.
 */
object LogUtil {

    private const val TAG = "Mr.T"

    fun E(str: String) = E(TAG, str)

    fun E(tag: String, str: String) {
        Log.e(tag, str)
    }

    fun D(str: String) = D(TAG, str)

    fun D(tag: String, str: String) {
        Log.d(tag, str)
    }
}