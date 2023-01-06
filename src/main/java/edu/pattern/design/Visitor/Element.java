package edu.pattern.design.Visitor;

/**
 * Element : Visitor 를 허용하기 위한 Interface
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public interface Element {
    String accept(Visitor visitor);
}