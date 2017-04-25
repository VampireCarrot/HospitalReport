package com.bsoft.hs.ui.home;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.bsoft.hs.R;
import com.bsoft.hs.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by 泅渡者
 * Created on 2017/4/25.
 */

public class HomeActivity extends BaseActivity<HomeContract.Presenter> implements HomeContract.View {
    @Bind(R.id.rl_one)
    RelativeLayout rlOne;
    @Bind(R.id.rl_five)
    RelativeLayout rlFive;
    @Bind(R.id.rl_two)
    RelativeLayout rlTwo;
    @Bind(R.id.rl_six)
    RelativeLayout rlSix;
    @Bind(R.id.rl_three)
    RelativeLayout rlThree;
    @Bind(R.id.rl_seven)
    RelativeLayout rlSeven;
    @Bind(R.id.rl_four)
    RelativeLayout rlFour;
    @Bind(R.id.rl_eight)
    RelativeLayout rlEight;
    @Bind(R.id.ll_back)
    LinearLayout llBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        this.createPresenter(new HomePresenter(this,this));
        presenter.setBack(R.drawable.icon_mbk);
    }
    @Override
    public void hideLoading() {

    }


    @Override
    public void showBack(BitmapDrawable drawable) {
        llBack.setBackground(drawable);
    }
}
