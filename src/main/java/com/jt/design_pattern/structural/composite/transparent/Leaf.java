package com.jt.design_pattern.structural.composite.transparent;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/14 16:23
 */
public class Leaf implements Component {
    private String name;
    protected Leaf(String name){
        this.name = name;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int index) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println(name + "：被访问！");
    }
}
