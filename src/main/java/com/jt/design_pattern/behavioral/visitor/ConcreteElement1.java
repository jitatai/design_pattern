package com.jt.design_pattern.behavioral.visitor;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 9:44
 */
public class ConcreteElement1 implements Element {
    @Override
    public String operation() {
        return "元素1具体操作";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
