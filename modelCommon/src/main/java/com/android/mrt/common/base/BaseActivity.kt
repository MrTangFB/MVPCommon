package com.android.mrt.common.base

import android.app.Activity
import android.os.Bundle

/**
 * Created by Mr.T on 2018/3/16.
 */
abstract class BaseActivity : Activity() {

    /**
     * Layout资源文件
     */
    protected abstract val mContentViewRes: Int

    /**
     * 初始化数据标志
     * 如需每次返回界面重新加载，则在界面隐藏时设置标志位为true
     */
    protected var mFirstCreate = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mContentViewRes)
        window.setBackgroundDrawable(null)
        initView()
    }

    override fun onResume() {
        super.onResume()
        if (mFirstCreate) {
            initData()
            mFirstCreate = false
        }
    }

    /**
     * 初始化界面
     */
    protected abstract fun initView()

    /**
     * 初始化数据
     */
    protected abstract fun initData()
}