package edu.pattern.design.Visitor;

import java.util.Iterator;

/**
 * Entity : Entity 는 Data Structure 만 관리하고, 실제 처리는 Visitor 에 위임한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public abstract class Entity implements Element {
    public abstract String getName();

    public abstract Integer getSize();

    public void add(Entity entity) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}