package com.jt.design_pattern.behavioral.chainofresponsibility;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 13:45
 */
public class OneCommand implements Command {
    private Receive receive;

    protected OneCommand(){
        receive = new Receive();
    }

    @Override
    public void execute() {
        receive.action1();
    }
}
