package edu.pattern.design.AbstractFactory;

import edu.pattern.design.AbstractFactory.Framework.Factory;
import edu.pattern.design.AbstractFactory.Framework.Link;
import edu.pattern.design.AbstractFactory.Framework.Page;
import edu.pattern.design.AbstractFactory.Framework.Tray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * AbstractFactoryTest : Framework 의 추상 클래스만 Import 해도 사용할 수 있다!
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class AbstractFactoryTest {
    @Test
    @DisplayName("AbstractFactory Main Test")
    void test() throws Exception {
        //given
        final var title = "Title";
        final var author = "Author";
        final var url = new URL("http://localhost:8080");

        final var expected = "<html><head><title>Title</title><meta author=Author /></head><body><ul><li><a href=http://localhost:8080>localhost</a></li></ul></body></html>";

        Factory factory = Factory.getFactory("edu.pattern.design.AbstractFactory.ListFactory.ListFactory");

        //when
        Link link = factory.createLink("localhost", url);
        Tray tray = factory.createTray("tray");
        tray.add(link);
        Page page = factory.createPage(title, author);
        page.add(tray);
        //then
        assertThat(page.makeHTML()).isEqualTo(expected);

    }
}