package com.example.db2application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.db2application.persenter2.BasePresenter;
import com.example.db2application.view2.IScoreView;

public abstract class BaseScoreActivity<V extends IScoreView, P extends BasePresenter<V>> extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        p = createPresenter((V)this);
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        p.onDestroy();
    }

    public abstract P createPresenter(V v);

    private P p;
}
