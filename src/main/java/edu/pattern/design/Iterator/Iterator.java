package edu.pattern.design.Iterator;

/**
 * Iterator : Aggregate 에서 한 요소씩 접근하는 인터페이스
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public interface Iterator {
    boolean hasNext();

    Object next();
}
