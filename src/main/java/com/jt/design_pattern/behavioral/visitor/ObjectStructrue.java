package com.jt.design_pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 9:47
 */
public class ObjectStructrue {
    private List<Element> list;
    ObjectStructrue(){
        list = new ArrayList<>();
    }
    void add(Element element){
        list.add(element);
    }
    void remove(Element element){
        list.remove(element);
    }

    void accept(Visitor visitor){
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().accept(visitor);
        }
    }
}
