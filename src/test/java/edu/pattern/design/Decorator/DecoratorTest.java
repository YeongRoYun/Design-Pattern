package edu.pattern.design.Decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * DecoratorTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class DecoratorTest {
    @Test
    @DisplayName("Decorator Test : SideBorder")
    void testSideBorder() {
        //given
        final Display display = new StringDisplay("content");
        final Border deco = new SideBorder(display);

        //when & then
        assertThat(deco.show()).isEqualTo("|content|\n");
    }

    @Test
    @DisplayName("Decorator Test : FullBorder")
    void testFullBorder() {
        //given
        final Display display = new StringDisplay("content");
        final Border deco = new FullBorder(display);
        String expected = "-".repeat("content".length() + 2) + "\n" +
                "|" + "content" + "|" + "\n" +
                "-".repeat("content".length() + 2) + "\n";

        //when & then
        assertThat(deco.show()).isEqualTo(expected);
    }

    @Test
    @DisplayName("Decorator Test : MixedBorder")
    void testMixedBorder() {
        //given
        final Display display = new StringDisplay("content");
        final Border deco = new FullBorder(new SideBorder(display));
        String expected = "-".repeat("|content|".length() + 2) + "\n" +
                "|" + "|content|" + "|" + "\n" +
                "-".repeat("|content|".length() + 2) + "\n";

        //when & then
        assertThat(deco.show()).isEqualTo(expected);
    }
}