package com.jt.design_pattern.behavioral.state.thread;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 17:03
 */
public class NewState extends IState{
    NewState(){
        this.stateName = "新建";
        System.out.println("当前为新建状态");
    }
    void start(IContext context){
        System.out.print("调用start()方法-->");
        if (stateName.equals("新建")) {
            context.setState(new RunnableState());
        } else {
            System.out.println("当前线程不是新建状态，不能调用start()方法.");
        }
    }
}
