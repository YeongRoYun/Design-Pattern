package edu.pattern.design.Memento;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * MementoTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class MementoTest {
    @Test
    @DisplayName("Memento Main Test : Print Result")
    void test() {
        //given
        final var gamer = new Gamer(128);

        Memento memento = gamer.createMemento(); // 처음 상태 저장

        for (int i = 0; i < 100; i++) {
            System.out.println("============= " + i);
            System.out.println("Current : " + gamer);
            gamer.bet();
            System.out.println("Result : " + gamer);

            if(gamer.getMoney() > memento.getMoney()) {
                System.out.println("Save the current state");
                memento = gamer.createMemento();
            } else if(gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("Restore the previous state");
                gamer.restoreMemento(memento);
            }
        }

    }
}