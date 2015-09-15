package com.wulin.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 武功，此处指一套武功，比如太极拳八卦掌
 */
public class KungFu {
    private String name;
    private List<Act> actList = new ArrayList<Act>();

    public KungFu(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
