package edu.pattern.design.Adapter;

/**
 * Print : Adapter 역할. Banner 를 수정하지 않고 기능을 추가한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public interface Print {
    String printWeak(String content);

    String printStrong(String content);
}
