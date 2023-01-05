package edu.pattern.design.Bridge;

/**
 * DisplayImpl : Implemental Class Hierarchy 의 최상위 클래스
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public interface DisplayImpl {
    String rawOpen();

    String rawPrint(String content);

    String rawClose();
}
