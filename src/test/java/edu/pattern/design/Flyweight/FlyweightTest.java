package edu.pattern.design.Flyweight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * FlyweightTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class FlyweightTest {
    @Test
    @DisplayName("Flyweight Main Test")
    void test() {
        //given
        final var bigString = new BigString("0101");
        final var expected = "0'sfont1'sfont".repeat(2);
        //when & then
        assertThat(bigString.print()).isEqualTo(expected);
    }
}