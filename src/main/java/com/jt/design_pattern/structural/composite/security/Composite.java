package com.jt.design_pattern.structural.composite.security;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 16:25
 */
public class Composite implements Component {
    private List<Component> children = new ArrayList<>();


    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public Component getChild(int index) {
        return children.get(index);
    }

    @Override
    public void operation() {
        for (Component component : children){
            component.operation();
        }
    }
}
