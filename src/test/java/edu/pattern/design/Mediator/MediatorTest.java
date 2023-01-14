package edu.pattern.design.Mediator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * MediatorTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class MediatorTest {
    @Test
    @DisplayName("Mediator Main Test")
    void test() {
        //given
        final Mediator mediator = new LoginFrame();
        final Colleague button = mediator.createColleague("button");
        final Colleague textField = mediator.createColleague("textfield");
        final ColleagueCheckbox checkBox = (ColleagueCheckbox) mediator.createColleague("checkbox");

        //when & then
        assertThat(checkBox.changeState("user")).isEqualTo("checkbox : true, button : true, textfield : true");
        assertThat(checkBox.changeState("guest")).isEqualTo("checkbox : true, button : false, textfield : false");
    }
}