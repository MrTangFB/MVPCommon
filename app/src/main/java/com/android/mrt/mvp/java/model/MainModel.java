package com.android.mrt.mvp.java.model;

import com.android.mrt.common.base.BaseMvpModel;
import com.android.mrt.common.interfaces.ResultCallBack;
import com.android.mrt.mvp.java.contract.IMainContract;

public class MainModel extends BaseMvpModel implements IMainContract.IMainModel {

    @Override
    public void getTitle(ResultCallBack<String> callback) {
        callback.onSuccess("I am title by java.", ResultCallBack.SUCCESS_CODE, ResultCallBack.SUCCESS_MSG);
    }
}
