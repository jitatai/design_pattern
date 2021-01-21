package com.jt.design_pattern.behavioral.mediator;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 9:58
 */
public abstract class Colleague {
    Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send();
    public abstract void receive();
}
