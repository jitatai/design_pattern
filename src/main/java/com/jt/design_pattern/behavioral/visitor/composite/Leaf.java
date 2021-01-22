package com.jt.design_pattern.behavioral.visitor.composite;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 9:44
 */
public class Leaf implements Element {
    @Override
    public String operation() {
        return "叶子元素具体操作";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
