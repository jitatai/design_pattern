package com.jt.design_pattern.behavioral.command;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 10:32
 */
public class Context {
    private Command command;

    protected Context(Command command){
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(){
        command.execute();
    }
}
