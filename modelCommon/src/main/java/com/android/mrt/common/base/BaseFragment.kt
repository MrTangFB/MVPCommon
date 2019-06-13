package com.android.mrt.common.base


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Mr.T on 2018/3/17.
 */
abstract class BaseFragment : Fragment() {

    /**
     * Layout资源文件
     */
    protected abstract val mContentViewRes: Int

    /**
     * 初始化数据标志
     * 如需每次返回界面重新加载，则在界面隐藏时设置标志位为true
     */
    protected var mFirstCreate = true

    /**
     * 跟布局对象
     */
    protected lateinit var mRootView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        mRootView = inflater.inflate(mContentViewRes, null)
        return mRootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
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