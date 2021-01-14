package com.jt.design_pattern.structural.flyweight;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 14:05
 */
public class UnSharedConcreteFlyWeight {
    private String info;

    protected UnSharedConcreteFlyWeight(String info){
        this.info = info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
