package edu.pattern.design.State;

import lombok.Getter;

/**
 * NightState : Concrete State. 밤에 수행되는 작업 정의
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class NightState implements State {
    @Getter
    private static final NightState instance = new NightState();

    private NightState() {
    }

    @Override
    public void doClock(Context context, Integer hour) {
        if (hour >= 9 && hour <= 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public String doUse(Context context) {
        return context.recordLog("Night Use");
    }

    @Override
    public String doAlarm(Context context) {
        return context.callSecurityCenter("Night Emergency");
    }

    @Override
    public String doPhone(Context context) {
        return context.callSecurityCenter("Night Call");
    }

    @Override
    public String toString() {
        return "[Night]";
    }
}