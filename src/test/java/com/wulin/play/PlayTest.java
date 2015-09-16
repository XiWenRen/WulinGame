package com.wulin.play;

import com.wulin.domain.KungFu;
import com.wulin.domain.Role;
import com.wulin.domain.Sect;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

/**
 * Created by MyPC on 2015/9/16.
 */
public class PlayTest {
    Play play = new Play();

    @Test
    public void createHeroTest(){
        Sect sect = new Sect("武当");
        Role role = new Role("张四风",sect);
        KungFu taijiFist = new KungFu("太极拳");
        KungFu taijiSword = new KungFu("太极剑");
        role.addKungFu(taijiFist);
        role.addKungFu(taijiSword);

        play.createHero(role);
    }

    @Test
    public void fightTest() throws Exception {
        throw new Exception();
    }

    @Test
    public void exerciseTest(){

    }
}
