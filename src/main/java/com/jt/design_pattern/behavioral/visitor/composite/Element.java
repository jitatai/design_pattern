package com.jt.design_pattern.behavioral.visitor.composite;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 9:43
 */
public interface Element {
    String operation();
    void accept(Visitor visitor);
}
