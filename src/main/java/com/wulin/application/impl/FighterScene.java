package com.wulin.application.impl;

import com.wulin.application.Scene;
import com.wulin.domain.Role;

import java.util.ArrayList;
import java.util.List;

/**
 * 战斗场景
 * 通常是两个角色战斗
 * 战斗流程如下：
 * 1.一方出招后，另一方选择招式进行应对
 * 2.两方出招后，进行招式威力或招式速度判断
 * 3.对于招式失败者，判断生死，若未有一方死亡则胜者进行下一次出招
 * 4.记录每次出招信息
 */
public class FighterScene implements Scene {

    Role[] roles = new Role[2];
    List<String> fightInfoList = new ArrayList<String>();
    int currentRole = 0;

    public FighterScene(Role role1, Role role2) {
        roles[0] = role1;
        roles[1] = role2;
    }

    /**
     * 设置当前出招者
     */
    public void switchCurrentRole() {
        currentRole = currentRole == 0 ? 1 : 0;
    }

    @Override
    public void init() {

    }

    @Override
    public void destory() {

    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            Role role = roles[currentRole];
            fightInfoList.add(role.getName() + "使用一招" + role.getKungFuList().get(0));
            switchCurrentRole();
            i++;
        }
    }
}
