package edu.pattern.design.Builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * BuilderTest
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
**/
public class BuilderTest {
    @Test
    @DisplayName("BuilderTest : TextBuilder")
    void testText() {
        //given
        final var textBuilder = new TextBuilder();
        final var director = new Director(textBuilder);
        //when & then
        director.construct();
        assertThat(textBuilder.getResult()).isEqualTo("Title\nContent\nItem1\nItem2\n");
    }

    @Test
    @DisplayName("BuilderTest : HtmlBuilder")
    void testHtml() {
        //given
        final var htmlBuilder = new HtmlBuilder();
        final var director = new Director(htmlBuilder);

        //when & then
        director.construct();
        assertThat(htmlBuilder.getResult()).isEqualTo("<html><head><title>Title</title></head><body><p>Content</p><ul><li>Item1</li><li>Item2</li></ul></body></html>");
    }
}