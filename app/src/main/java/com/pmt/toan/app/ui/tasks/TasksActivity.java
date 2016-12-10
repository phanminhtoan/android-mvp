package com.pmt.toan.app.ui.tasks;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pmt.toan.app.MainActivity;
import com.pmt.toan.app.R;
import com.pmt.toan.app.ui.base.BaseActivity;
import com.pmt.toan.app.ui.home.HomePresenter;

public class TasksActivity extends BaseActivity {

    @Override
    protected void intializePresenter() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, TasksActivity.class);
    }
}
