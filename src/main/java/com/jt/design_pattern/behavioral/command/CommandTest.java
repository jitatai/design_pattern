package com.jt.design_pattern.behavioral.command;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 10:46
 */
public class CommandTest {
    @Test
    public void commandTest(){
        Context context = new Context(new ConcreteCommand1());
        context.execute();
        context.setCommand(new ConcreteCommand2());
        context.execute();
    }
}
