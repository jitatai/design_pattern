package com.jt.design_pattern.structural.bridge.bridgeandadapter;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/13 14:03
 */
public class Adapter extends ConcreteImplementor {
    private Adptee adptee;
    protected Adapter(Adptee adptee){
        this.adptee = adptee;
    }
    @Override
    public void OperationImpl(){
        super.OperationImpl();
        adptee.specificRequest();
    }
}
