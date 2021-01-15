package com.jt.design_pattern.behavioral.command;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 10:22
 */
public class ConcreteCommand2 implements Command {
    private Receiver receiver = new Receiver2();

    @Override
    public void execute() {
        receiver.action();
    }
}
