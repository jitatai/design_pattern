package com.jt.design_pattern.behavioral.iterator.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/21 17:25
 */
public class Composite implements Component {
    private List<Component> list = new ArrayList<>();
    public void add(Component component){
        list.add(component);
    }
    public void remove(Component component){
        list.remove(component);
    }

    @Override
    public void opreation() {
        Iterator iterator = getIterator();
        while (iterator.hasNext()){
            Component next = (Component) iterator.next();
            next.opreation();
        }
    }

    public Iterator getIterator(){
        return new Composite.ConcreteIterator(this.list);
    }

    interface Iterator{
        boolean hasNext();
        Object next();
    }
    class ConcreteIterator implements Iterator{
        List<Component> list;
        private int index = -1;
        ConcreteIterator(List<Component> list){
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            if (index < list.size() - 1){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return list.get(++index);
        }
    }
}
