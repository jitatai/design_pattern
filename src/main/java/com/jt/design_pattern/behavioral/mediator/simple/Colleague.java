package com.jt.design_pattern.behavioral.mediator.simple;

import com.jt.design_pattern.behavioral.mediator.Mediator;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 9:58
 */
public abstract class Colleague {
    public abstract void send();
    public abstract void receive();
}
