package edu.pattern.design.State;

/**
 * Context : State 의존적인 작업을 위임한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public interface Context {
    void setClock(Integer hour);

    void changeState(State state);

    String callSecurityCenter(String msg);

    String recordLog(String msg);


}
