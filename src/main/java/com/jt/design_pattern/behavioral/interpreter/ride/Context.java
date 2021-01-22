package com.jt.design_pattern.behavioral.interpreter.ride;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 16:22
 */
public class Context {
    private String[] citys = {"韶关", "广州"};
    private String[] persons = {"老人", "妇女", "儿童"};
    private Expression cityPerson;
    public Context(){
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city,person);
    }
    public void ride(String info){
        boolean isFree = cityPerson.interpret(info);
        if (isFree){
            System.out.println("您是" + info + "，您本次乘车免费！");
            return;
        }
        System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
    }
}
