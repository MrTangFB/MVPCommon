package com.android.mrt.common.base

import android.os.Bundle
import java.lang.reflect.ParameterizedType

/**
 * Created by Mr.T on 2018/3/17.
 */
abstract class BaseMvpFragment<V, P : BaseMvpPresenter<V>> : BaseFragment() {

    /**
     * MVP模式中持有Presenter对象
     */
    private var mPresenter: P? = null

    fun getPresenter(): P? {
        return mPresenter
    }

    /**********************************************************************************************/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = createPresenter()
        @Suppress("UNCHECKED_CAST")
        mPresenter?.attach(this as V)
    }

    override fun onDestroy() {
        mPresenter?.detach()
        mPresenter = null
        super.onDestroy()
    }

    /**
     * 此方法自动生成Presenter
     */
    private fun <P : BaseMvpPresenter<V>> createPresenter(): P {
        val type = javaClass.genericSuperclass as ParameterizedType
        val actualTypeArguments = type.actualTypeArguments
        @Suppress("UNCHECKED_CAST")
        val presenterClass = actualTypeArguments[1] as Class<P>
        val presenter = presenterClass.newInstance() as BaseMvpPresenter<V>
        presenter.onCreate(context)
        @Suppress("UNCHECKED_CAST")
        return presenter as P
    }
}