package edu.pattern.design.Proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * ProxyTest
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
**/
public class ProxyTest {
    @Test
    @DisplayName("Proxy Main Test")
    void test() throws InterruptedException {
        //given
        final var proxyPrinter = new ProxyPrinter("test");
        final var content = "content";
        //when & then
        assertThat(proxyPrinter.getReal()).isNull();
        assertThat(proxyPrinter.print(content)).isEqualTo(content);
        assertThat(proxyPrinter.getReal()).isNotNull();
    }
}