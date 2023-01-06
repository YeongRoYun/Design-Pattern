package edu.pattern.design.Composite;

import java.util.ArrayList;

/**
 * Directory : Composite Node 로서, 내부에 다른 Entity 를 담을 수 있다.
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
        for(Entity entity : directory) {
            ret += entity.getSize();
        }
        return ret;
    }

    @Override
    public String print(String prefix) {
        final var builder = new StringBuilder();
        builder.append(prefix).append("/").append(this).append("\n");
        for (Entity entity : directory) {
            builder.append(entity.print(prefix + "/" + name)).append("\n");
        }
        return builder.toString();
    }

    @Override
    public void add(Entity entity) {
        directory.add(entity);
    }
}