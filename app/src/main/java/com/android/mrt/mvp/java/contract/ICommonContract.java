package com.android.mrt.mvp.java.contract;

import com.android.mrt.common.interfaces.ResultCallBack;

public interface ICommonContract {

    interface ICommonModel {

        void getUser(ResultCallBack<String> callback);
    }
}
