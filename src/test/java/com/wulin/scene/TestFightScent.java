package com.wulin.scene;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wulin.scene.impl.FightScene;
import com.wulin.domain.KungFu;
import com.wulin.domain.Role;
import com.wulin.domain.Sect;
import com.wulin.util.JsonUtil;
import org.junit.Test;

import java.util.List;

/**
 * 战斗场景测试类
 */
public class TestFightScent {

    FightScene scene = new FightScene();

    @Test
    public void setAdapterTest() {
        List<Role> roleList = JsonUtil.getJson();
        scene.addRole(roleList.get(0), roleList.get(1));
        List<String> infoList = scene.getEvent().run();
        infoList.forEach(System.out::println);
    }
}
