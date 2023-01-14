package edu.pattern.design.Observer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * ObserverTest
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
**/
public class ObserverTest {
    @Test
    @DisplayName("Observer Main Test : Print Result")
    void test() {
        //given
        final var generator = new RandomNumberGenerator();
        generator.addObserver(new DigitObserver());
        generator.addObserver(new GraphObserver());
        //when & then
        generator.execute();
    }
}