package edu.pattern.design.ChainOfResponsibility;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ChainOfResponsibilityTest {
    @Test
    @DisplayName("ChainOfResponsibility Main Test : Print Result")
    void test() {
        //given
        final Support noSupport = new NoSupport("NoSupport", null);
        final Support specialSupport = new SpecialSupport("SpecialSupport", null, 2);
        final Support limitSupport = new LimitSupport("LimitSupport", null, 5);
        final Support oddSupport = new OddSupport("OddSupport", null);
        final var troubles = new ArrayList<Trouble>();
        for (int i = 0; i < 10; i++) {
            troubles.add(new Trouble(i));
        }
        //when & then
        specialSupport.setNext(limitSupport);
        limitSupport.setNext(oddSupport);
        oddSupport.setNext(noSupport);

        for(Trouble trouble : troubles) {
            System.out.println(specialSupport.support(trouble));
        }
    }
}