package edu.pattern.design.Decorator;

/**
 * Border : Decorator Base Class. Display 와 Api 를 공유한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public abstract class Border extends Display {
    protected final Display display;

    public Border(Display display) {
        this.display = display;
    }
}