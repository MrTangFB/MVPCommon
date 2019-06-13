package com.android.mrt.mvp.model

import com.android.mrt.common.base.BaseMvpModel
import com.android.mrt.common.interfaces.ResultCallBack
import com.android.mrt.mvp.contract.IMainContract

class MainModel : BaseMvpModel(), IMainContract.IMainModel {

    override fun getTitle(callback: ResultCallBack<String>) {
        callback.onSuccess("我是Title")
    }
}