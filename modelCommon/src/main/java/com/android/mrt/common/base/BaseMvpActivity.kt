package com.android.mrt.common.base

import android.os.Bundle

/**
 * Created by Mr.T on 2018/3/17.
 */
abstract class BaseMvpActivity<V, P : BaseMvpPresenter<V>> : BaseActivity() {

    /**
     * MVP模式中Presenter对象
     */
    protected abstract var mMvpPresenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNCHECKED_CAST")
        mMvpPresenter.attach(this as V)
    }

    override fun onDestroy() {
        mMvpPresenter.detach()
        super.onDestroy()
    }
}