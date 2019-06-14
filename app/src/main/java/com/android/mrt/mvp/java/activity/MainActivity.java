package com.android.mrt.mvp.java.activity;

import android.widget.TextView;

import com.android.mrt.R;
import com.android.mrt.common.base.BaseMvpActivity;
import com.android.mrt.mvp.java.contract.IMainContract;
import com.android.mrt.mvp.java.presenter.MainPresenter;

public class MainActivity extends BaseMvpActivity<IMainContract.IMainView, MainPresenter> implements IMainContract.IMainView {

    @Override
    protected int getMContentViewRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        getPresenter().getTitle();
        getPresenter().getUser();
    }

    @Override
    public void showTitle(String title) {
        ((TextView) findViewById(R.id.mTitle_TV)).setText(title);
    }

    @Override
    public void showUser(String user) {
        ((TextView) findViewById(R.id.mUser_TV)).setText(user);
    }
}
