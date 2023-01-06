package edu.pattern.design.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Directory : Concrete Entity & ObjectStructure(Entity Container) 역할
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class Directory extends Entity {
    private final String name;
    private final Integer size;
    private final ArrayList<Entity> directory;

    public Directory(String name, Integer size) {
        this.name = name;
        this.size = size;
        this.directory = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getSize() {
        Integer ret = size;
        for (Entity entity : directory) {
            ret += entity.getSize();
        }
        return ret;
    }

    @Override
    public void add(Entity entity) {
        directory.add(entity);
    }

    @Override
    public Iterator iterator() throws FileTreatmentException {
        return directory.iterator();
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}