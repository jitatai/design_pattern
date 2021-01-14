package com.jt.design_pattern.structural.composite.transparent;

import org.junit.jupiter.api.Test;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 16:28
 */
public class CompositeTest {
    @Test
    public void compositeTest(){
        Component root = new Composite();
        Component branch = new Composite();
        Component rootLeaf = new Leaf("根树叶");
        Component branchLeaf1 = new Leaf("分支树叶1");
        Component branchLeaf2 = new Leaf("分支树叶2");

        root.add(branch);
        root.add(rootLeaf);

        branch.add(branchLeaf1);
        branch.add(branchLeaf2);

        root.operation();
    }
}
