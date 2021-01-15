package com.jt.design_pattern.behavioral.state.thread;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 17:03
 */
public class RunnableState extends IState{
    RunnableState(){
        this.stateName = "就绪";
        System.out.println("当前为就绪状态");
    }

    void getCPU(IContext context){
        System.out.print("getCPU()方法-->");
        if (stateName.equals("就绪")) {
            context.setState(new RunningState());
        } else {
            System.out.println("当前线程不是新建状态，不能调用getCPU()方法.");
        }
    }
}
