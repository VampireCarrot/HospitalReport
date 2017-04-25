package com.bsoft.hs.ui.home;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

import com.bsoft.hs.base.BaseCommonPresenter;
import com.bsoft.hs.utils.FastBlur;

import okhttp3.RequestBody;

/**
 * Created by 泅渡者
 * Created on 2017/4/25.
 */

public class HomePresenter extends BaseCommonPresenter<HomeContract.View> implements HomeContract.Presenter {

    public HomePresenter(HomeContract.View view, Context context) {
        super(view, context);
    }

    @Override
    public void setBack(int resourceid) {
        int scaleRatio = 10;
        int blurRadius = 5;
        Bitmap mBitmap = BitmapFactory.decodeResource(context.getResources(), resourceid);
        Bitmap scaledBitmap = Bitmap.createScaledBitmap(mBitmap,
                mBitmap.getWidth() / scaleRatio,
                mBitmap.getHeight() / scaleRatio,
                false);
        Bitmap blurBitmap = FastBlur.doBlur(scaledBitmap, blurRadius, true);
        BitmapDrawable bd = new BitmapDrawable(blurBitmap);
        view.showBack(bd);
    }

    @Override
    public void LoadMenu(RequestBody responseBody) {

    }
}
