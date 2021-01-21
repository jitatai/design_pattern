package com.jt.design_pattern.behavioral.mediator;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 10:40
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    public void send() {
        System.out.println("具体同事类1发送请求。");
        mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }
}
