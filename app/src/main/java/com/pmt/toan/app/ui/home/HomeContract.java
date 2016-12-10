package com.pmt.toan.app.ui.home;

import com.pmt.toan.app.ui.base.BasePresenter;
import com.pmt.toan.app.ui.base.BaseVIew;

/**
 * Created by User on 10/12/2016.
 */

public interface HomeContract {
    interface View extends BaseVIew {
        void updateData(String value);
    }

    interface Presenter extends BasePresenter<View> {
        void increaseValue();
    }
}
