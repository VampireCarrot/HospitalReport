package com.bsoft.hs.api;


import com.bsoft.hs.model.HttpExceptionBean;

/**
 * Created by 泅渡者
 * Created on 2017/3/22.
 * 回调实例
 */
public abstract class SimpleMyCallBack<T> implements MyCallBack<T>{
    @Override
    public void onCompleted() {
    }

    @Override
    public void onError(HttpExceptionBean mHttpExceptionBean) {
    }
}
