package edu.pattern.design.ChainOfResponsibility;

import lombok.Setter;

/**
 * Support : Handler 의 역할. 자신이 처리할 수 있으면 처리하고, 아니면 다음 Handler 로 위임한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public abstract class Support {
    protected String name;
    @Setter
    protected Support next;

    public Support(String name, Support next) {
        this.name = name;
        this.next = next;
    }

    public String support(Trouble request) {
        if (resolve(request)) {
            return done(request);
        } else if (next != null) {
            return next.support(request);
        } else {
            return fail(request);
        }
    }

    protected abstract Boolean resolve(Trouble request);

    protected String done(Trouble request) {
        return String.format("%s is resolved by %s", request, this);
    }

    protected String fail(Trouble request) {
        return String.format("%s cannot be resolved", request);
    }

    @Override
    public String toString() {
        return String.format("[Supporter %s]", name);
    }
}