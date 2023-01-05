package edu.pattern.design.Prototype;

import edu.pattern.design.Prototype.Framework.Manager;
import edu.pattern.design.Prototype.Product.MessageBox;
import edu.pattern.design.Prototype.Product.UnderlinePen;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * PrototypeTest
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
**/
public class PrototypeTest {
    @Test
    @DisplayName("Prototype Main Test")
    void test() {
        //given
        final var manager = new Manager();
        manager.register("ulPen", new UnderlinePen());
        manager.register("msgBox", new MessageBox());

        //when & then
        assertThat(manager.create("ulPen")).isNotEqualTo(manager.create("ulPen"));
        assertThat(manager.create("msgBox")).isNotEqualTo(manager.create("msgBox"));
    }
}