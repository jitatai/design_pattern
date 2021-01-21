package com.jt.design_pattern.behavioral.mediator.simple;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 10:40
 */
public class ConcreteColleague2 extends Colleague {
    @Override
    public void send() {
        System.out.println("具体同事类2发送请求。");
        SingleTonEnumMediator.getMediator().relay(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }
}
