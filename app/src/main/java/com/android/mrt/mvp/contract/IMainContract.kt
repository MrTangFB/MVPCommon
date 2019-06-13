package com.android.mrt.mvp.contract

import com.android.mrt.common.interfaces.ResultCallBack

interface IMainContract {

    interface IMainView {

        fun showTitle(title: String)

        fun showUser(user: String)
    }

    interface IMainPresenter {

        fun getTitle()

        fun getUser()
    }

    interface IMainModel {

        fun getTitle(callback: ResultCallBack<String>)
    }
}