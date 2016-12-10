package com.pmt.toan.app.ui.home;

/**
 * Created by User on 10/12/2016.
 */

public class HomePresenter implements HomeContract.Presenter {

    private  HomeContract.View mView;
    private  int mValue;
    @Override
    public void increaseValue() {
        mValue++;
        mView.updateData(String.valueOf(mValue));
    }

    @Override
    public void setView(HomeContract.View view) {
        mView = view;
    }
}
