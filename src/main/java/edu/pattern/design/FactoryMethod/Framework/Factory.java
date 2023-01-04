package edu.pattern.design.FactoryMethod.Framework;

/**
 * Factory : Product 를 생성하는 방식을 정의한 클래스
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}