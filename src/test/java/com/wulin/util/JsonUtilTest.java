package com.wulin.util;

import com.google.gson.Gson;
import com.wulin.domain.KungFu;
import com.wulin.domain.Role;
import com.wulin.domain.Sect;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * Json工具测试类
 */
public class JsonUtilTest {


    //    @Ignore
    @Test
    public void addToJsonFileTest() {

        Sect sect = new Sect("武当");
        Role role = new Role("张四风", sect);
        KungFu taijiFist = new KungFu("太极拳");
        KungFu taijiSword = new KungFu("太极剑");
        role.addKungFu(taijiFist);
        role.addKungFu(taijiSword);

        Sect heroSect = new Sect("全真");
        Role hero = new Role("李逍遥", heroSect);
        KungFu heroKF1 = new KungFu("御剑诀");
        KungFu heroKF2 = new KungFu("万剑诀");
        hero.addKungFu(heroKF1);
        hero.addKungFu(heroKF2);

        JsonUtil.addToJsonFile(hero);
        JsonUtil.addToJsonFile(role);
    }

    @Test
    public void getJsonTest() {
        List<Role> roleList = JsonUtil.getJson();
        roleList.forEach(System.out::println);
    }

}
