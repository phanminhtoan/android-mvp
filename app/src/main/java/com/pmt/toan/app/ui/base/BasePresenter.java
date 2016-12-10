package com.pmt.toan.app.ui.base;

/**
 * Created by User on 10/12/2016.
 */

public interface BasePresenter <T extends BaseVIew>  {
    public void setView(T view);
}
