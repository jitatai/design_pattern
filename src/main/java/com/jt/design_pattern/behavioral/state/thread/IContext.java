package com.jt.design_pattern.behavioral.state.thread;

/**
 * @author jiatai.hu
 * @version 1.0
 * @date 2021/1/15 17:01
 */
public class IContext {
    private IState state;

    IContext(){
        state = new NewState();
    }

    public void setState(IState state) {
        this.state = state;
    }

    public IState getState() {
        return state;
    }

    public void start(){
        ((NewState) state).start(this);
    }
    public void getCPU(){
        ((RunnableState) state).getCPU(this);
    }
    public void suspend(){
        ((RunningState) state).suspend(this);
    }
    public void stop(){
        ((RunningState) state).stop(this);
    }
    public void resume(){
        ((BlockedState) state).resume(this);
    }

}
