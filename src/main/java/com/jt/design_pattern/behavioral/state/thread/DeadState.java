package com.jt.design_pattern.behavioral.state.thread;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 17:03
 */
public class DeadState extends IState{
    DeadState(){
        this.stateName = "死亡";
        System.out.println("当前为死亡状态");
    }
}
