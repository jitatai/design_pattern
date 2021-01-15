package com.jt.design_pattern.behavioral.command.compositecommand;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 11:31
 */
public class CompositeCommandTest {
    @Test
    public void compositeCommandTest(){
        CompositeCommand root = new CompositeCommand();
        CompositeCommand compositeCommand = new CompositeCommand();
        root.add(compositeCommand);
        root.add(new ConcreteCommand1());
        compositeCommand.add(new ConcreteCommand1());
        compositeCommand.add(new ConcreteCommand2());
        root.execute();

    }
}
