package edu.pattern.design.Mediator;

/**
 * Mediator : Colleague 간의 의존 관계를 관리한다. 각 클래스의 의존성을 분산시키지 않는다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public interface Mediator {
    Colleague createColleague(String type);

    String colleagueChanged(String mode);
}
