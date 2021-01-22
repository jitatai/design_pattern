package com.jt.design_pattern.behavioral.memento;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 11:22
 */
public class MementoTest {
    @Test
    public void mementoTest(){
        Originator originator = new Originator();
        originator.setState("111");
        CreateManager createManager = new CreateManager();
        createManager.setMemento(originator.createMemento());

        originator.setState("222");
        originator.reloadMemento(createManager.getMemento());
        System.out.println(originator.getState());
    }
}
