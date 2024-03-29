package com.android.mrt.common.base

import android.content.Context
import android.util.ArrayMap

/**
 * Created by Mr.T on 2018/3/17.
 */
abstract class BaseMvpPresenter<V> {

    private var mContext: Context? = null

    fun getContext(): Context? {
        return mContext
    }

    /**
     * MVP模式中持有View对象
     */
    private var mView: V? = null

    fun getView(): V? {
        return mView
    }

    /**
     * 此方法直接获取Model，自动生成管理
     */
    fun <M : BaseMvpModel> getModel(modelClass: Class<M>): M {
        val typeName = modelClass.name
        var model = mModelMap?.get(typeName)
        if (model == null) {
            model = modelClass.newInstance() as BaseMvpModel
            model.onCreate(mContext)
            mModelMap?.put(typeName, model)
        }
        @Suppress("UNCHECKED_CAST")
        return model as M
    }

    /**********************************************************************************************/

    /**
     * 保存所有Model的Map
     */
    private var mModelMap: ArrayMap<String, BaseMvpModel>? = ArrayMap()

    /**
     * 勿手动调用
     */
    fun onCreate(context: Context?) {
        mContext = context
    }

    /**
     * 勿手动调用
     */
    fun attach(view: V) {
        mView = view
    }

    /**
     * 勿手动调用
     */
    fun detach() {
        cleanAllModel()
        mView = null
        mContext = null
    }

    private fun cleanAllModel() {
        val iterator = mModelMap?.keys?.iterator()
        if (iterator != null)
            while (iterator.hasNext()) {
                val model = mModelMap?.get(iterator.next()) as BaseMvpModel
                model.onDestroy()
            }
        mModelMap?.clear()
        mModelMap = null
    }
}