package com.jt.design_pattern.behavioral.memento.prototype;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 15:05
 */
public class MementoTest {
    @Test
    public void testMemento() throws CloneNotSupportedException {
        OriginatorPrototype originatorPrototype = new OriginatorPrototype();
        originatorPrototype.setState("打工人");
        System.out.println("初始状态：" + originatorPrototype.getState());
        OriginatorPrototype memento = originatorPrototype.createMemento();

        CreateManagePrototype createManagePrototype = new CreateManagePrototype();
        createManagePrototype.setOriginatorPrototype(memento);

        originatorPrototype.setState("高富帅");
        System.out.println("更新状态：" + originatorPrototype.getState());

        originatorPrototype.restoreMemento(createManagePrototype.getOriginatorPrototype());
        System.out.println("恢复状态：" + originatorPrototype.getState());
    }
}
