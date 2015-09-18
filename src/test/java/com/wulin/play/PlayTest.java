package com.wulin.play;

import com.wulin.domain.KungFu;
import com.wulin.domain.Role;
import com.wulin.domain.Sect;
import com.wulin.util.JsonUtil;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

/**
 * 启动器测试类
 */
public class PlayTest {
    Play play = new Play();

    @Test
    public void createHeroTest() {
        play.createHero(JsonUtil.getJson().get(0));
    }

    @Test
    public void fightTest() {

    }

    @Test
    public void exerciseTest() {

    }
}
