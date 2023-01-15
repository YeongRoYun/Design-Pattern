package edu.pattern.design.Command.drawer;

import edu.pattern.design.Command.command.Command;

/**
 * DrawCommand : Concrete Command
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class DrawCommand implements Command {
    private Drawable drawable;
    private Integer position;

    public DrawCommand(Drawable drawable, Integer position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public String execute() {
        return drawable.draw(position);
    }
}