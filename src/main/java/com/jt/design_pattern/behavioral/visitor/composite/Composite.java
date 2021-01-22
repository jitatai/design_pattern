package com.jt.design_pattern.behavioral.visitor.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 9:44
 */
public class Composite implements Element {
    List<Element> list = new ArrayList<>();
    @Override
    public String operation() {
        for (Element element : list){
            System.out.println(element.operation());
        }
        return "组合具体操作";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Element getChild(int index){
        return list.get(index);
    }

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }


}
