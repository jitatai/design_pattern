package com.jt.design_pattern.behavioral.visitor.composite;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 10:03
 */
public class ConcreteVisitor1 implements Visitor {

    @Override
    public void visit(Leaf leaf) {
        System.out.println("访问者1访问：" + leaf.operation());
    }

    @Override
    public void visit(Composite composite) {
        System.out.println("访问者1访问：" + composite.operation());
    }
}
