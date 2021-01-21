package com.jt.design_pattern.behavioral.mediator.estate;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 10:58
 */
public interface Mediator {
    void relay(String from,String message);
    void register(Costomer costomer);
}
