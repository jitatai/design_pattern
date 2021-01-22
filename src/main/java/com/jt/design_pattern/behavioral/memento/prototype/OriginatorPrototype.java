package com.jt.design_pattern.behavioral.memento.prototype;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 14:57
 */
public class OriginatorPrototype implements Cloneable {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void restoreMemento(OriginatorPrototype originatorPrototype){
        setState(originatorPrototype.getState());
    }

    public OriginatorPrototype createMemento() throws CloneNotSupportedException {
        return (OriginatorPrototype)this.clone();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
