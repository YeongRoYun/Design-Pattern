package edu.pattern.design.Command;

import edu.pattern.design.Command.command.MacroCommand;
import edu.pattern.design.Command.drawer.DrawCanvas;
import edu.pattern.design.Command.drawer.DrawCommand;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * CommandTest
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class CommandTest {
    @Test
    @DisplayName("Command Main Test")
    void test() {
        //given
        final var history = new MacroCommand();
        final var canvas = new DrawCanvas(history);
        history.append(new DrawCommand(canvas, 1));
        history.append(new DrawCommand(canvas, 2));

        //when & then
        assertThat(canvas.paint()).isEqualTo("Draw at 1\nDraw at 2\n");
    }
}