package com.jt.design_pattern.behavioral.visitor;

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
        objectStructrue.add(new ConcreteElement1());
        objectStructrue.add(new ConcreteElement2());

        objectStructrue.accept(new ConcreteVisitor1());
        objectStructrue.accept(new ConcreteVisitor2());
    }
}
