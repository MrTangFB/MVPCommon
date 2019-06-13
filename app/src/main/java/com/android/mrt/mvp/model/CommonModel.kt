package com.android.mrt.mvp.model

import com.android.mrt.common.base.BaseMvpModel
import com.android.mrt.common.interfaces.ResultCallBack
import com.android.mrt.mvp.contract.ICommonContract

class CommonModel : BaseMvpModel(), ICommonContract.ICommonModel {

    override fun getUser(callback: ResultCallBack<String>) {
        callback.onSuccess("我是Mr.T")
    }
}