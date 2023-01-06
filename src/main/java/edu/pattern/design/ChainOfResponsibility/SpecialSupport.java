package edu.pattern.design.ChainOfResponsibility;

import java.util.Objects;

/**
 * SpecialSupport : Concrete Handler
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class SpecialSupport extends Support {
    private final Integer id;

    public SpecialSupport(String name, Support next, Integer id) {
        super(name, next);
        this.id = id;
    }

    @Override
    protected Boolean resolve(Trouble request) {
        return Objects.equals(request.id(), id);
    }
}