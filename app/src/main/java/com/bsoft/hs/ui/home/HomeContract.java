package com.bsoft.hs.ui.home;

import android.graphics.drawable.BitmapDrawable;

import com.bsoft.hs.base.BasePresenter;
import com.bsoft.hs.base.BaseView;

import okhttp3.RequestBody;

/**
 * Created by 泅渡者
 * Created on 2017/4/25.
 */

public interface HomeContract {
    interface View extends BaseView {
        void showBack(BitmapDrawable drawable);
    }

    interface Presenter extends BasePresenter {
        void setBack(int resourceid);
        void LoadMenu(RequestBody responseBody);
    }
}
