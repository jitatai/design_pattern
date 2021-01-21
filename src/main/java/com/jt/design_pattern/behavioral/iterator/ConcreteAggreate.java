package com.jt.design_pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/21 16:30
 */
public class ConcreteAggreate implements Aggregate {
    private List<Object> list;
    private Iterator iterator;
    ConcreteAggreate(){
        list = new ArrayList<>();
        iterator = new ConcreteIterator(list);
    }

    public void setIterator(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return this.iterator;
    }
}
