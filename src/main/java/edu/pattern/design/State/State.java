package edu.pattern.design.State;

/**
 * State : 상태 의존적 연산에 대한 클래스. 각 상태가 하나의 클래스로 표현된다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public interface State {
    void doClock(Context context, Integer hour);

    String doUse(Context context);

    String doAlarm(Context context);

    String doPhone(Context context);
}
