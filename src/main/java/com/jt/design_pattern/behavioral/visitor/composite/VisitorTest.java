package com.jt.design_pattern.behavioral.visitor.composite;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 10:06
 */
public class VisitorTest {
    @Test
    public void visitorTest(){
        ObjectStructrue objectStructrue = new ObjectStructrue();
        objectStructrue.add(new Leaf());
        Composite composite = new Composite();
        composite.add(new Leaf());
        composite.add(new Leaf());
        objectStructrue.add(composite);

        objectStructrue.accept(new ConcreteVisitor1());
        objectStructrue.accept(new ConcreteVisitor2());
    }
}
