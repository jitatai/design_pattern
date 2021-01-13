package com.jt.design_pattern.structural.adapter.twoway;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 10:25
 */
public class TwoWayAdpteeRealize implements TwoWayAdptee {
    @Override
    public void specificRequest() {
        System.out.println("适配器代码");
    }
}
