package com.jt.design_pattern.behavioral.interpreter.ride;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/22 16:20
 */
public class AndExpression implements Expression {
    private Expression city;
    private Expression person;
    public AndExpression(Expression city,Expression person){
        this.city = city;
        this.person = person;
    }
    @Override
    public boolean interpret(String info) {
        String[] infos = info.split("的");
        return city.interpret(infos[0]) && person.interpret(infos[1]);
    }
}
