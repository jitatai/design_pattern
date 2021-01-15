package com.jt.design_pattern.behavioral.state.thread;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 17:03
 */
public class BlockedState extends IState{
    BlockedState(){
        this.stateName = "阻塞";
        System.out.println("当前为阻塞状态");
    }
    void resume(IContext context){
        System.out.print("调用resume()方法-->");
        if (stateName.equals("阻塞")) {
            context.setState(new RunnableState());
        } else {
            System.out.println("当前线程不是新建状态，不能调用resume()方法.");
        }
    }
}
