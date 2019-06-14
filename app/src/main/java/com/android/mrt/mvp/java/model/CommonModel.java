package com.android.mrt.mvp.java.model;

import com.android.mrt.common.base.BaseMvpModel;
import com.android.mrt.common.interfaces.ResultCallBack;
import com.android.mrt.mvp.java.contract.ICommonContract;


public class CommonModel extends BaseMvpModel implements ICommonContract.ICommonModel {
    @Override
    public void getUser(ResultCallBack<String> callback) {
        callback.onSuccess("Mr.T", ResultCallBack.SUCCESS_CODE, ResultCallBack.SUCCESS_MSG);
    }
}
