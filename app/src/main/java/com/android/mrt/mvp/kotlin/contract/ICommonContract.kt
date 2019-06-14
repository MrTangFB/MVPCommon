package com.android.mrt.mvp.kotlin.contract

import com.android.mrt.common.interfaces.ResultCallBack

interface ICommonContract {

    interface ICommonModel {

        fun getUser(callback: ResultCallBack<String>)
    }
}