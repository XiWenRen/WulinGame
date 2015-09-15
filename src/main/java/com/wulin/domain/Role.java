package com.wulin.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 2015/9/15.
 */
public class Role {

    private String name;
    private String sex;
    private String age;
    private String strength;
    private Sect sect;

    List<KungFu> kungFuList = new ArrayList<KungFu>();

    public Role(String name ,Sect sect){
        this.name = name;
        this.sect = sect;
    }

    public void addKungFu(KungFu kungFu){
        kungFuList.add(kungFu);
    }

    @Override
    public String toString() {
        return "name:" + this.name + ",Sect:" + sect + ",KungFus:" + kungFuList;
    }
}
