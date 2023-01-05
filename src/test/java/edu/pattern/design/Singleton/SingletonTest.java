package edu.pattern.design.Singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * SingletonTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/05
 **/
class SingletonTest {
    @Test
    @DisplayName("Singleton Main Test")
    void test() {
        //given
        var obj1 = Singleton.getInstance();
        var obj2 = Singleton.getInstance();

        //when & then
        assertThat(obj1).isEqualTo(obj2);
    }
}