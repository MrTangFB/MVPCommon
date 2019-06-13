package com.android.mrt.mvp.presenter

import android.content.Context
import com.android.mrt.common.base.BaseMvpPresenter
import com.android.mrt.common.interfaces.ResultCallBack
import com.android.mrt.mvp.contract.IMainContract
import com.android.mrt.mvp.model.CommonModel
import com.android.mrt.mvp.model.MainModel

class MainPresenter(context: Context) : BaseMvpPresenter<IMainContract.IMainView>(mContext = context), IMainContract.IMainPresenter {

    override fun getTitle() {
        getModel(MainModel::class.java).getTitle(object : ResultCallBack<String>() {
            override fun onSuccess(data: String, code: Int, msg: String) {
                mView?.showTitle(data)
            }

            override fun onFail(e: Exception, code: Int, msg: String) {

            }
        })
    }

    override fun getUser() {
        getModel(CommonModel::class.java).getUser(object : ResultCallBack<String>() {
            override fun onSuccess(data: String, code: Int, msg: String) {
                mView?.showUser(data)
            }

            override fun onFail(e: Exception, code: Int, msg: String) {

            }
        })
    }
}