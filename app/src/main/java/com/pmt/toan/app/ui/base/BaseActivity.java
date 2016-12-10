package com.pmt.toan.app.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by User on 10/12/2016.
 */

public abstract  class BaseActivity extends AppCompatActivity {

    protected  abstract void intializePresenter();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intializePresenter();
    }
}
