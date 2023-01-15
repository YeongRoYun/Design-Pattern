package edu.pattern.design.Command.drawer;


import edu.pattern.design.Command.command.MacroCommand;
import lombok.AllArgsConstructor;

/**
 * DrawCanvas : Concrete Receiver
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
@AllArgsConstructor
public class DrawCanvas implements Drawable {
    private MacroCommand history;

    @Override
    public String draw(Integer position) {
        return "Draw at " + position;
    }

    public String paint() {
        return history.execute();
    }
}