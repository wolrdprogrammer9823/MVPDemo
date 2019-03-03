package com.example.db2application.persenter2;

import com.example.db2application.model2.IScore;
import com.example.db2application.model2.IScoreImpl;
import com.example.db2application.view2.IScoreView;

public class ScorePresenter<V extends IScoreView> extends BasePresenter<V> {

    private IScore iScore;

    public ScorePresenter(V v) {

        super(v);
        iScore = new IScoreImpl();
    }

    public void toFetchData() {

        if (weakReference.get() != null) {

            weakReference.get().getScores(iScore.obtainScore());
        }
    }
}
