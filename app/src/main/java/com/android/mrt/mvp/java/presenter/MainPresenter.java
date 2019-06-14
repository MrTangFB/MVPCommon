package com.android.mrt.mvp.java.presenter;

import com.android.mrt.common.base.BaseMvpPresenter;
import com.android.mrt.common.interfaces.ResultCallBack;
import com.android.mrt.mvp.java.contract.IMainContract;
import com.android.mrt.mvp.java.model.CommonModel;
import com.android.mrt.mvp.java.model.MainModel;

import org.jetbrains.annotations.NotNull;

public class MainPresenter extends BaseMvpPresenter<IMainContract.IMainView> implements IMainContract.IMainPresenter {

    @Override
    public void getTitle() {
        getModel(MainModel.class).getTitle(new ResultCallBack<String>() {
            @Override
            public void onSuccess(String data, int code, @NotNull String msg) {
                getView().showTitle(data);
            }

            @Override
            public void onFail(@NotNull Exception e, int code, @NotNull String msg) {

            }
        });
    }

    @Override
    public void getUser() {
        getModel(CommonModel.class).getUser(new ResultCallBack<String>() {
            @Override
            public void onSuccess(String data, int code, @NotNull String msg) {
                getView().showUser(data);
            }

            @Override
            public void onFail(@NotNull Exception e, int code, @NotNull String msg) {

            }
        });
    }
}
