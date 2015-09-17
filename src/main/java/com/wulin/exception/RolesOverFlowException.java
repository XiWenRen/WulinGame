package com.wulin.exception;

/**
 * 当角色数量超出可接受范围时抛出此异常
 */
public class RolesOverFlowException extends RuntimeException{

    public RolesOverFlowException(int qty){
        super("角色数量必须是" + qty + "个");
    }
}
