package com.jt.design_pattern.behavioral.mediator;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 10:43
 */
public class MediatorTest {
    @Test
    public void mediatorTest(){
        Mediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();
        mediator.register(colleague1);
        mediator.register(colleague2);

        colleague1.send();
        colleague2.send();
    }
}
