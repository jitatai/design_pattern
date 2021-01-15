package com.jt.design_pattern.behavioral.chainofresponsibility;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 13:38
 */
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void doFiler(Command command);
}
