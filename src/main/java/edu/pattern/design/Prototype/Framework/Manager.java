package edu.pattern.design.Prototype.Framework;

import java.util.HashMap;

/**
 * Manager : Product 를 등록하고, 그것을 바탕으로 새로운 인스턴스를 생성하는 클래스
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public class Manager {
    private final HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String name) {
        return showcase.get(name).createClone();
    }
}