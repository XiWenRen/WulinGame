package com.wulin.event;

import com.wulin.domain.Role;
import com.wulin.adapter.impl.SEAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 2015/9/17.
 */
public interface Event {

    SEAdapter<Role> adapter = new SEAdapter<Role>();
    List<String> fightInfoList = new ArrayList<>();

    List<String> run();

    default void setAdapter(SEAdapter<Role> adapter){
        this.adapter.addAdapter(adapter);
    }
}
