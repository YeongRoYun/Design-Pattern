package edu.pattern.design.ChainOfResponsibility;

/**
 * OddSupport : Concrete Handler
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class OddSupport extends Support {
    public OddSupport(String name, Support next) {
        super(name, next);
    }

    @Override
    protected Boolean resolve(Trouble request) {
        return request.id() % 2 == 1;
    }
}