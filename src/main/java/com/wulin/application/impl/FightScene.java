package com.wulin.application.impl;

import com.wulin.application.Event;
import com.wulin.application.Scene;
import com.wulin.domain.Role;
import com.wulin.domain.SEAdapter;

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
public class FightScene implements Scene {


    @Override
    public void init() {

    }

    @Override
    public void destory() {

    }

}
