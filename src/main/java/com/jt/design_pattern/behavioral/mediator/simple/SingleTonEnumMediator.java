package com.jt.design_pattern.behavioral.mediator.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/21 11:06
 */
public class SingleTonEnumMediator {
    List<Colleague> colleagues;
    private SingleTonEnumMediator(){
        colleagues = new ArrayList<>();
    }
    private enum SingleTonEnum{
        INSTANCE;
        private SingleTonEnumMediator singleTonEnumMediator;
        SingleTonEnum(){
            singleTonEnumMediator = new SingleTonEnumMediator();
        }
    }
    public static SingleTonEnumMediator getMediator(){
        return SingleTonEnum.INSTANCE.singleTonEnumMediator;
    }

    public void register(Colleague colleague){
        colleagues.add(colleague);
    }

    public void relay(Colleague colleague){
        for (Colleague c : colleagues){
            if (c.equals(colleague)){
                continue;
            }
            c.receive();
        }
    }
}
