package edu.pattern.design.Strategy;

/**
 * Strategy : 가위바위보 전략 클래스
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
