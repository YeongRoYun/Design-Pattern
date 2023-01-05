package edu.pattern.design.Bridge;

/**
 * Display : Functional Class Hierarchy 의 최상위 클래스
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class Display {
    private final DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public String open() {
        return impl.rawOpen();
    }

    public String print(String content) {
        return impl.rawPrint(content);
    }

    public String close() {
        return impl.rawClose();
    }

    public String display(String content) {
        return open() +
                print(content) +
                close();
    }
}