package com.jt.design_pattern.behavioral.command;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 10:22
 */
public class ConcreteCommand1 implements Command {
    private Receiver receiver = new Receiver1();

    @Override
    public void execute() {
        receiver.action();
    }
}
