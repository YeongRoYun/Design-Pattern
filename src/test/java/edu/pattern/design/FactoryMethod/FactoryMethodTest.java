package edu.pattern.design.FactoryMethod;

import edu.pattern.design.FactoryMethod.Framework.Factory;
import edu.pattern.design.FactoryMethod.Framework.Product;
import edu.pattern.design.FactoryMethod.IDCard.IDCardFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * FactoryMethodTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/04
 **/
public class FactoryMethodTest {
    @Test
    @DisplayName("FactoryMethod Main Test")
    void test() {
        //given
        final Factory factory = new IDCardFactory();
        final Product product = factory.create("owner1");
        factory.create("owner2");

        //when & then
        assertThat(product.use()).isEqualTo("Verify owner1");
        assertThat(((IDCardFactory) factory).getIdCards()).containsExactly("owner1", "owner2");
    }
}