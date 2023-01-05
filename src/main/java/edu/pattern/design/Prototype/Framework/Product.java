package edu.pattern.design.Prototype.Framework;

/**
 * Product : Prototype 으로 이용될 인스턴스의 원형
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public interface Product extends Cloneable {
    String use(String content);

    Product createClone();
}
