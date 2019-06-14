package com.android.mrt.mvp.kotlin.model

import com.android.mrt.common.base.BaseMvpModel
import com.android.mrt.common.interfaces.ResultCallBack
import com.android.mrt.mvp.kotlin.contract.ICommonContract

class CommonModel : BaseMvpModel(), ICommonContract.ICommonModel {

    override fun getUser(callback: ResultCallBack<String>) {
        callback.onSuccess("Mr.T")
    }
}