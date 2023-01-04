package edu.pattern.design.TemplateMethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TemplateMethodTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public class TemplateMethodTest {
    @Test
    @DisplayName("TemplateMethodTest : CharDisplay")
    void testChar() {
        //given
        final var content = "c";
        final AbstractDisplay charDisplay = new CharDisplay();
        //when&then
        assertThat(charDisplay.display(content)).isEqualTo("<<" + content.repeat(5) + ">>");
    }

    @Test
    @DisplayName("TemplateMethodTest : StringDisplay")
    void testString() {
        //given
        final var content = "hello, world";
        final AbstractDisplay charDisplay = new StringDisplay();
        String expected = "*****************\n" +
                ("* " + content + "\n").repeat(5) +
                "*****************\n";

        //when&then
        assertThat(charDisplay.display(content))
                .isEqualTo(expected);
    }
}