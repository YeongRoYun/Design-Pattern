package edu.pattern.design.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Memento : Gamer 의 상태를 나타낸다. Package 외부에서 생성 및 내부 정보에 접근하지 못하도록 접근 제어자를 이용한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class Memento {
    Integer money;
    List<String> fruits = new ArrayList<>();

    Memento(Integer money) {
        this.money = money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public Integer getMoney() {
        return this.money;
    }
}