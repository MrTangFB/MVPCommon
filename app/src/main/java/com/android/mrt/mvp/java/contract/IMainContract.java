package com.android.mrt.mvp.java.contract;

import com.android.mrt.common.interfaces.ResultCallBack;

public interface IMainContract {

    interface IMainView {

        void showTitle(String title);

        void showUser(String user);
    }

    interface IMainPresenter {

        void getTitle();

        void getUser();
    }

    interface IMainModel {

        void getTitle(ResultCallBack<String> callback);
    }
}
