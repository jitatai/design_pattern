package com.jt.design_pattern.behavioral.chainofresponsibility;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 13:53
 */
public class TwoCommand implements Command {
    private Receive receive;
    protected TwoCommand(){
        receive = new Receive();
    }
    @Override
    public void execute() {
        receive.action2();
    }
}
