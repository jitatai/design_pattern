package com.jt.design_pattern.behavioral.iterator.composite;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/21 17:37
 */
public class CompositeIteratorTest {
    @Test
    public void test(){
        Leaf leaf = new Leaf();
        Leaf leaf1 = new Leaf();
        Composite composite = new Composite();
        composite.add(leaf);
        composite.add(leaf1);
        composite.opreation();
    }
}
