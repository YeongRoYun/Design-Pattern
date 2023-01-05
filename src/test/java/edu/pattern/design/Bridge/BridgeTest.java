package edu.pattern.design.Bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * BridgeTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class BridgeTest {
    @Test
    @DisplayName("Bridge Test : Display")
    void testDisplay() {
        //given
        final var display = new Display(new StringDisplayImpl());
        final var expected = "[content]";

        //when & then
        assertThat(display.display("content")).isEqualTo(expected);
    }

    @Test
    @DisplayName("Bridge Test : CountDisplay")
    void testMultiDisplay() {
        //given
        final var display = new CountDisplay(new StringDisplayImpl());
        final var expected = "[content]\n".repeat(5);
        //when&then
        assertThat(display.multiDisplay("content", 5)).isEqualTo(expected);
    }
}