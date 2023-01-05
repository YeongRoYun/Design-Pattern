package edu.pattern.design.Bridge;

/**
 * StringDisplayImpl : Implemental Class 의 구현체
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class StringDisplayImpl implements DisplayImpl {
    @Override
    public String rawOpen() {
        return "[";
    }

    @Override
    public String rawPrint(String content) {
        return content;
    }

    @Override
    public String rawClose() {
        return "]";
    }
}