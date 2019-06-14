package com.android.mrt.mvp.kotlin.activity

import com.android.mrt.R
import com.android.mrt.common.base.BaseMvpActivity
import com.android.mrt.mvp.kotlin.contract.IMainContract
import com.android.mrt.mvp.kotlin.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseMvpActivity<IMainContract.IMainView, MainPresenter>(), IMainContract.IMainView {

    override val mContentViewRes: Int = R.layout.activity_main

    override fun initView() {

    }

    override fun initData() {
        getPresenter()?.getTitle()
        getPresenter()?.getUser()
    }

    override fun showTitle(title: String) {
        mTitle_TV.text = title
    }

    override fun showUser(user: String) {
        mUser_TV.text = user
    }
}