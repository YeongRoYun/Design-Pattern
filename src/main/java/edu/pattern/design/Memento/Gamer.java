package edu.pattern.design.Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Gamer : Memento Instance 를 생성하는 클래스
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class Gamer {
    private Integer money;
    private List<String> fruits = new ArrayList<>();
    private Random gen = new Random(1);
    private static String[] fruitname = {
            "Apple", "Grape", "Banana", "Orange"
    };

    public Gamer(Integer money) {
        this.money = money;
    }

    public Integer getMoney() {
        return this.money;
    }

    public void bet() {
        int dice = gen.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("Increase money");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("Decrease money");
        } else if (dice == 6) {
            final var fruit = getFruit();
            System.out.println("Get " + fruit);
            fruits.add(fruit);
        } else {
            System.out.println("Not changed");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for (final var fruit :
                fruits) {
            if (fruit.startsWith("Delicious")) {
                m.addFruit(fruit);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.fruits;
    }

    @Override
    public String toString() {
        return String.format("[money = %d, fruits = %s]", money, fruits);
    }

    private String getFruit() {
        String prefix = null;
        if (gen.nextBoolean()) {
            prefix = "Delicious";
        } else {
            prefix = "";
        }
        return prefix + fruitname[gen.nextInt(fruitname.length)];
    }

}