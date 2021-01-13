package com.jt.design_pattern.structural.adapter.twoway;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 10:29
 */
public class TwoWayAdpterTest {
    public static void main(String[] args) {
        TwoWayAdptee twoWayAdptee = new TwoWayAdpter(new TwoWayAdpteeRealize());
        twoWayAdptee.specificRequest();
        TwoWayTarget twoWayTarget = new TwoWayAdpter(new TwoWayTargetRealize());
        twoWayTarget.request();
    }
}
