package com.wulin.play;


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
        System.out.println(role.toString());
    }
}
