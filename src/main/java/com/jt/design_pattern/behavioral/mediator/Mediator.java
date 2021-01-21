package com.jt.design_pattern.behavioral.mediator;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 9:57
 */
public interface Mediator {
    void register(Colleague colleague);
    void relay(Colleague colleague);
}
