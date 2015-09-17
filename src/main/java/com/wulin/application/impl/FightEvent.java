package com.wulin.application.impl;

import com.wulin.application.Event;
import com.wulin.domain.Role;
import com.wulin.domain.SEAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 2015/9/17.
 */
public class FightEvent implements Event{

    Role[] roles = new Role[2];
    int currentRole = 0;

    /**
     * 设置当前出招者
     */
    public void switchCurrentRole() {
        currentRole = currentRole == 0 ? 1 : 0;
    }


    @Override
    public List<String> run() {
        if(roles[0] == null || roles[1] == null)
            this.roles = adapter.getDataList().toArray(new Role[2]);
        int i = 0;
        while (i < 10) {
            Role role = roles[currentRole];
            fightInfoList.add(role.getName() + "使用一招" + role.getKungFuList().get(0));
            switchCurrentRole();
            i++;
        }
        return this.fightInfoList;
    }
}
