package com.jt.design_pattern.behavioral.mediator.simple;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/21 11:23
 */
public class MediatorTest {
    @Test
    public void mediatorTest(){
        SingleTonEnumMediator mediator = SingleTonEnumMediator.getMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1();
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2();
        mediator.register(concreteColleague1);
        mediator.register(concreteColleague2);
        concreteColleague1.send();
        concreteColleague2.send();
    }
}
