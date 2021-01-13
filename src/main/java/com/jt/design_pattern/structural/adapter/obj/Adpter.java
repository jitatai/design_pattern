package com.jt.design_pattern.structural.adapter.obj;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 9:57
 */
public class Adpter implements Target {
    private Adptee adptee;

    public Adpter(Adptee adptee){
        this.adptee = adptee;
    }
    @Override
    public void request() {
        adptee.specificRequest();
    }
}
