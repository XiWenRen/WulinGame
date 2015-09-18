package com.wulin.play;


import com.wulin.scene.Scene;
import com.wulin.scene.impl.FightScene;
import com.wulin.domain.KungFu;
import com.wulin.domain.Role;
import com.wulin.domain.Sect;

public class Play {

    /**
     * 创建主角
     *
     * @param role 界面上获取的主角的基本信息
     */
    public void createHero(Role role) {
        //TODO 初始化主角的基本信息

    }

    /**
     * 创建战斗场景，并返回战斗信息
     *
     * @param role1
     * @param role2
     * @return 战斗信息(暂时战斗场景能够满足了)
     */
    public Scene fight(Role role1, Role role2) {
        Scene fightScene = new FightScene();
        return fightScene;
    }

    public void exercise(Role hero) {

    }
}
