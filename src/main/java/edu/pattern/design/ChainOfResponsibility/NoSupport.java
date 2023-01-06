package edu.pattern.design.ChainOfResponsibility;

/**
 * NoSupport : Concrete Handler
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class NoSupport extends Support {
    public NoSupport(String name, Support next) {
        super(name, next);
    }

    @Override
    protected Boolean resolve(Trouble request) {
        return false;
    }
}