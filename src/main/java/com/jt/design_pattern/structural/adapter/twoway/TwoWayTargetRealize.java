package com.jt.design_pattern.structural.adapter.twoway;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 10:26
 */
public class TwoWayTargetRealize implements TwoWayTarget {
    @Override
    public void request() {
        System.out.println("目标代码");
    }
}
