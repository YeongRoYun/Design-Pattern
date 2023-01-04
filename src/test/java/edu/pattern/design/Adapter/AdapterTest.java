package edu.pattern.design.Adapter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * AdapterTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public class AdapterTest {
    @Test
    @DisplayName("Adapter Test : Inheritance")
    void testInheritance() {
        //given
        final var content = "Wonderful";
        final Print print = new PrintBannerByInheritance();

        //when & then
        assertThat(print.printStrong(content)).isEqualTo("*" + content + "*");
        assertThat(print.printWeak(content)).isEqualTo("(" + content + ")");
    }

    @Test
    @DisplayName("Adapter Test : Delegation")
    void testDelegation() {
        //given
        final var content = "Wonderful";
        final Print print = new PrintBannerByDelegation();

        //when & then
        assertThat(print.printStrong(content)).isEqualTo("*" + content + "*");
        assertThat(print.printWeak(content)).isEqualTo("(" + content + ")");
    }
}