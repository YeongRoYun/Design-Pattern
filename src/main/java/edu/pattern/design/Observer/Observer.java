package edu.pattern.design.Observer;

/**
 * Observer : Subject 의 상태 변화를 통지 받아, 작업을 처리한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public interface Observer {
    void update(NumberGenerator gen);
}
