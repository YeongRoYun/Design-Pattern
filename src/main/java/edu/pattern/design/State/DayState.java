package edu.pattern.design.State;

import lombok.Getter;

/**
 * DayState : Concrete State. 낮에 수행되는 연산을 정의한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class DayState implements State {
    @Getter
    private static final DayState instance = new DayState();

    private DayState() {

    }

    @Override
    public void doClock(Context context, Integer hour) {
        if (hour < 9 || hour > 17) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public String doUse(Context context) {
        return context.recordLog("Day Use");
    }

    @Override
    public String doAlarm(Context context) {
        return context.callSecurityCenter("Day Emergency");
    }

    @Override
    public String doPhone(Context context) {
        return context.callSecurityCenter("Day Call");
    }

    @Override
    public String toString() {
        return "[Day]";
    }
}