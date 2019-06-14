package com.android.mrt.mvp.kotlin.model

import com.android.mrt.common.base.BaseMvpModel
import com.android.mrt.common.interfaces.ResultCallBack
import com.android.mrt.mvp.kotlin.contract.IMainContract

class MainModel : BaseMvpModel(), IMainContract.IMainModel {

    override fun getTitle(callback: ResultCallBack<String>) {
        callback.onSuccess("I am title by kotlin")
    }
}