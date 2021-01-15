package com.jt.design_pattern.behavioral.state.thread;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 17:03
 */
public class RunningState extends IState{
    RunningState(){
        this.stateName = "运行";
        System.out.println("当前为运行状态");
    }

    void suspend(IContext context){
        System.out.print("调用suspend()方法-->");
        if (stateName.equals("运行")) {
            context.setState(new BlockedState());
        } else {
            System.out.println("当前线程不是新建状态，不能调用suspend()方法.");
        }
    }

    void stop(IContext context){
        System.out.print("调用stop()方法-->");
        if (stateName.equals("运行")) {
            context.setState(new DeadState());
        } else {
            System.out.println("当前线程不是新建状态，不能调用stop()方法.");
        }
    }
}
