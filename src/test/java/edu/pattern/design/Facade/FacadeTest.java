package edu.pattern.design.Facade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * FacadeTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class FacadeTest {
    @Test
    @DisplayName("Facade Main Test")
    void test() {
        //given
        final var mailAddr = "tester@test.com";
        final var expected = new StringBuilder();
        expected.append("<html><head><title>Welcome to tester's page!</title></head>")
                .append("<body><h1>Welcome to tester's page!</h1>")
                .append("<p>Contact me</p>")
                .append("<p><a href=\"mailto:tester@test.com\">tester</a></p>")
                .append("</body></html>");

        //when
        final var page = PageMaker.makeWelcomPage(mailAddr, "src/test/java/edu/pattern/design/Facade/maildata.txt");

        //then
        assertThat(page).isEqualTo(expected.toString());
    }
}