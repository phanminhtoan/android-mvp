package com.pmt.toan.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pmt.toan.app.ui.base.BaseActivity;
import com.pmt.toan.app.ui.home.HomeActivity;
import com.pmt.toan.app.ui.tasks.TasksActivity;

public  class MainActivity extends BaseActivity{

    @Override
    protected void intializePresenter() {
        // do nothing
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(TasksActivity.newIntent(this));
        finish();
    }
}
