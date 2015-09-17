package com.wulin.play;


import com.wulin.application.Scene;
import com.wulin.application.impl.FightScene;
import com.wulin.domain.KungFu;
import com.wulin.domain.Role;
import com.wulin.domain.Sect;

public class Play {
    public static void main(String[] args) {
        Sect sect = new Sect("武当");
        Role role = new Role("张四风",sect);
        KungFu taijiFist = new KungFu("太极拳");
        KungFu taijiSword = new KungFu("太极剑");
        role.addKungFu(taijiFist);
        role.addKungFu(taijiSword);

        Sect heroSect = new Sect("全真");
        Role hero = new Role("李逍遥",heroSect);
        KungFu heroKF1 = new KungFu("御剑诀");
        KungFu heroKF2 = new KungFu("万剑诀");
        hero.addKungFu(heroKF1);
        hero.addKungFu(heroKF2);

    }

    /**
     * 创建主角
     * @param role 界面上获取的主角的基本信息
     */
    public void createHero(Role role){
        //TODO 初始化主角的基本信息

    }

    /**
     * 创建战斗场景，并返回战斗信息
     * @param role1
     * @param role2
     * @return 战斗信息(暂时战斗场景能够满足了)
     */
    public Scene fight(Role role1, Role role2){
        Scene fightScene = new FightScene();
//        fightScene.run();
        return fightScene;
    }

    public void exercise(Role hero){

    }
}
