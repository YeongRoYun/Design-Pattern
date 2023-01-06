package edu.pattern.design.Visitor;

/**
 * Visitor : Data 에 대한 처리를 담당하는 Class
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public interface Visitor {
    String visit(File file);

    String visit(Directory directory);
}
