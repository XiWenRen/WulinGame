package com.wulin.application;

import com.wulin.domain.Role;
import com.wulin.domain.SEAdapter;
import com.wulin.exception.RolesOverFlowException;
import com.wulin.play.Play;

/**
 * 场景的接口
 * 1.规范场景接口，拥有通用方法:init(),destory()
 * 2.场景只是一个容器，场景内发生的事情有一个专门的事件执行器来执行，所以有一个规范的执行器，使用接口
 * 3.场景和事件执行器的初始化都可以用工厂来生产
 * 4.同一类的场景和执行器唯一区别的就是执行中的内容，因此场景初始化后应该保持缓存，以减少多次初始化带来的开销。
 */
public interface Scene {

    SEAdapter<Role> adapter = new SEAdapter<Role>();

    /**
     * 用来产生场景对应的事件的方法
     * @return
     */
    default Event getEvent(){
        String clsName = this.getClass().getTypeName();
        String scene = "Scene";
        String eventName = clsName.substring(0,clsName.length() - scene.length());
        eventName += "Event";
        Event event = null;
        try {
            event = (Event) Class.forName(eventName).newInstance();
            event.setAdapter(this.adapter);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return event;
    }

    default void addRole(Role... roles){
        if(roles.length > 2)
            throw new RolesOverFlowException(2);
        for(Role role : roles){
            adapter.addData(role);
        }
    }

    void init();

    void destory();

}