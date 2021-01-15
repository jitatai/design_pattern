package com.jt.design_pattern.behavioral.command.compositecommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 11:29
 */
public class CompositeCommand implements Command {
    private List<Command> commands =new ArrayList<>();

    void add(Command command){
        commands.add(command);
    }
    void remove(Command command){
        commands.remove(command);
    }
    @Override
    public void execute() {
        for (Command command : commands){
            command.execute();
        }
    }
}
