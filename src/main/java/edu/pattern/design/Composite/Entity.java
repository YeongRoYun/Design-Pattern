package edu.pattern.design.Composite;

/**
 * Entity : Component 역할로서, File 과 Directory 를 동일시 하기 위한 superClass
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public abstract class Entity {
    public abstract String getName();

    public abstract Integer getSize();

    public abstract String print(String prefix);

    public void add(Entity entity) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}