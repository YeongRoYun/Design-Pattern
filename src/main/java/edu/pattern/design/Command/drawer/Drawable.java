package edu.pattern.design.Command.drawer;

/**
 * Drawable : Receiver 역할로, Command 를 전달받아 명령을 수행한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public interface Drawable {
    String draw(Integer position);
}
