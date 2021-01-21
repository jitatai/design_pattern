package com.jt.design_pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 10:12
 */
public class ConcreteMediator implements Mediator {
    protected List<Colleague> colleagues;
    ConcreteMediator(){
        colleagues = new ArrayList<>();
    }
    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c : colleagues){
            if (!c.equals(colleague)){
                c.receive();
            }
        }
    }
}
