package edu.pattern.design.State;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * StateTest
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
**/
public class StateTest {
    @Test
    @DisplayName("State Test : Day")
    void testDay() {
        //given
        final var frame = new SafeFrame();

        //when
        frame.setClock(10); // day

        //then
        assertThat(frame.doRecord()).isEqualTo("Record : Day Use");
        assertThat(frame.doCall()).isEqualTo("Security : Day Call");
        assertThat(frame.doEmergency()).isEqualTo("Security : Day Emergency");
    }

    @Test
    @DisplayName("State Test : Night")
    void testNight() {
        //given
        final var frame = new SafeFrame();

        //when
        frame.setClock(18); // day

        //then
        assertThat(frame.doRecord()).isEqualTo("Record : Night Use");
        assertThat(frame.doCall()).isEqualTo("Security : Night Call");
        assertThat(frame.doEmergency()).isEqualTo("Security : Night Emergency");
    }
}