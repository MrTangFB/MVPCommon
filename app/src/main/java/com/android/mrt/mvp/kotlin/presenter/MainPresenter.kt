package com.android.mrt.mvp.kotlin.presenter

import com.android.mrt.common.base.BaseMvpPresenter
import com.android.mrt.common.interfaces.ResultCallBack
import com.android.mrt.mvp.kotlin.contract.IMainContract
import com.android.mrt.mvp.kotlin.model.CommonModel
import com.android.mrt.mvp.kotlin.model.MainModel

class MainPresenter : BaseMvpPresenter<IMainContract.IMainView>(), IMainContract.IMainPresenter {

    override fun getTitle() {
        getModel(MainModel::class.java).getTitle(object : ResultCallBack<String>() {
            override fun onSuccess(data: String, code: Int, msg: String) {
                getView()?.showTitle(data)
            }

            override fun onFail(e: Exception, code: Int, msg: String) {

            }
        })
    }

    override fun getUser() {
        getModel(CommonModel::class.java).getUser(object : ResultCallBack<String>() {
            override fun onSuccess(data: String, code: Int, msg: String) {
                getView()?.showUser(data)
            }

            override fun onFail(e: Exception, code: Int, msg: String) {

            }
        })
    }
}