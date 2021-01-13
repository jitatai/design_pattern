package com.jt.design_pattern.structural.adapter.twoway;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 10:27
 */
public class TwoWayAdpter implements TwoWayTarget,TwoWayAdptee {
    private TwoWayTarget twoWayTarget;
    private TwoWayAdptee twoWayAdptee;
    public TwoWayAdpter(TwoWayAdptee twoWayAdptee){
        this.twoWayAdptee = twoWayAdptee;
    }
    public TwoWayAdpter(TwoWayTarget twoWayTarget){
        this.twoWayTarget = twoWayTarget;
    }

    @Override
    public void specificRequest() {
        twoWayAdptee.specificRequest();
    }

    @Override
    public void request() {
        twoWayTarget.request();
    }
}
