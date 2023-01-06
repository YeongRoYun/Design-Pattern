package edu.pattern.design.ChainOfResponsibility;

/**
 * LimitSupport : Concrete Handler
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class LimitSupport extends Support {
    private final Integer limit;

    public LimitSupport(String name, Support next, Integer limit) {
        super(name, next);
        this.limit = limit;
    }

    @Override
    protected Boolean resolve(Trouble request) {
        return request.id() <= limit;
    }
}