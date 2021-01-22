package com.jt.design_pattern.behavioral.visitor;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 10:03
 */
public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visit(ConcreteElement1 concreteElement1) {
        System.out.println("访问者2访问" + concreteElement1.operation());
    }

    @Override
    public void visit(ConcreteElement2 concreteElement2) {
        System.out.println("访问者2访问" + concreteElement2.operation());
    }
}
