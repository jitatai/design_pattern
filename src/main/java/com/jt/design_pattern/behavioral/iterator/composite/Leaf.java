package com.jt.design_pattern.behavioral.iterator.composite;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/21 17:24
 */
public class Leaf implements Component {
    @Override
    public void opreation() {
        System.out.println("我是叶子" + this);
    }
}
