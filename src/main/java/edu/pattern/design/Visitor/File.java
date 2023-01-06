package edu.pattern.design.Visitor;

/**
 * File : Concrete Entity
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class File extends Entity {
    private final String name;
    private final Integer size;

    public File(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}