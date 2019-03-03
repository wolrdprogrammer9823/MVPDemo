package com.example.db2application.model2;
import java.util.ArrayList;
import java.util.List;

public class IScoreImpl implements IScore {

    @Override
    public List<String> obtainScore() {

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            stringList.add(String.valueOf(i + 1));
        }

        return stringList;
    }
}
