package com.pmt.toan.app.ui.home;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pmt.toan.app.R;
import com.pmt.toan.app.ui.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity implements HomeContract.View {
    @Override
    protected void intializePresenter() {
        mPresenter = new HomePresenter();
        mPresenter.setView(this);
    }

    @BindView(R.id.increase)
    protected Button mBtnIncrease;
    private HomePresenter mPresenter;

    public static Intent newIntent(Context context) {

        return new Intent(context, HomeActivity.class);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);


        mBtnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.increaseValue();
            }
        });
    }

    @Override
    public void updateData(String value) {
        mBtnIncrease.setText(value);
    }
}
