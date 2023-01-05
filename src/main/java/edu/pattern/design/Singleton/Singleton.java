package edu.pattern.design.Singleton;

/**
 * Singleton : Class 의 Instance 수를 제한하기 위해 사용. 생성자를 노출시키지 않고, 객체를 반환하는 메서드를 이용한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}