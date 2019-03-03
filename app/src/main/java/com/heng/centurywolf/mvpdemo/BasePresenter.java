package com.example.db2application.persenter2;

import java.lang.ref.WeakReference;

public class BasePresenter<V> {

    protected WeakReference<V> weakReference;

    public BasePresenter(V v) {

        weakReference = new WeakReference<>(v);
    }

    public void onDestroy() {

        weakReference.clear();
    }
}
