package edu.pattern.design.Mediator;

/**
 * Colleague : Colleague 간의 의존 관계는 Mediator 에 의해 통제된다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public interface Colleague {
    void setMediator(Mediator mediator);

    Boolean setColleagueEnabled(Boolean flag);
}
