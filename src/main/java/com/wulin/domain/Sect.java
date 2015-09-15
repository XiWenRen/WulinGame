package com.wulin.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 门派
 */
public class Sect {
    private String name;
    private Role boss;
    private List<Role> roleList = new ArrayList<Role>();
    private List<KungFu> kungFuList = new ArrayList<KungFu>();

    public Sect(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
