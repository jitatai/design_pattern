package com.jt.design_pattern.behavioral.visitor;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 9:43
 */
public interface Visitor {
    void visit(ConcreteElement1 concreteElement1);
    void visit(ConcreteElement2 concreteElement2);
}
