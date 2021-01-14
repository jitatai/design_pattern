package com.jt.design_pattern.structural.composite.transparent;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 16:04
 */
public interface Component {
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
    void operation();
}
