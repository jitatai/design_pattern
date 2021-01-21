package com.jt.design_pattern.behavioral.mediator.estate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/20 11:14
 */
public class EstateMediator implements Mediator {
    private List<Costomer> costomers;
    EstateMediator(){
        costomers = new ArrayList<>();
    }
    @Override
    public void relay(String from, String message) {
        for (Costomer costomer : costomers){
            if (!costomer.getName().equals(from)){
                costomer.receive(from,message);
            }
        }
    }

    @Override
    public void register(Costomer costomer) {
        if (!costomers.contains(costomer)){
            costomer.setMediator(this);
            costomers.add(costomer);
        }
    }
}
