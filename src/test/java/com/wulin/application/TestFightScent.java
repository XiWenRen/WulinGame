package com.wulin.application;

import com.wulin.application.impl.FightScene;
import com.wulin.domain.KungFu;
import com.wulin.domain.Role;
import com.wulin.domain.Sect;
import org.junit.Test;

import java.util.List;

/**
 * Created by MyPC on 2015/9/17.
 */
public class TestFightScent {

    FightScene scene = new FightScene();

    @Test
    public void setAdapterTest(){
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

        scene.addRole(role, hero);
        List<String> infoList = scene.getEvent().run();
        for (String info : infoList) {
            System.out.println(info);
        }

    }


}
