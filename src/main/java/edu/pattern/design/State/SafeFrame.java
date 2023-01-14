package edu.pattern.design.State;

/**
 * SafeFrame : Concrete Context
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class SafeFrame implements Context {
    private State state = DayState.getInstance();

    @Override
    public void setClock(Integer hour) {
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public String callSecurityCenter(String msg) {
        return "Security : " + msg;
    }

    @Override
    public String recordLog(String msg) {
        return "Record : " + msg;
    }

    public String doEmergency() {
        return state.doAlarm(this);
    }

    public String doRecord() {
        return state.doUse(this);
    }

    public String doCall() {
        return state.doPhone(this);
    }
}