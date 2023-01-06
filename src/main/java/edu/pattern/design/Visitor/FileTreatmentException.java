package edu.pattern.design.Visitor;

/**
 * FileTreatmentException : Composite 가 아닌 Entity
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class FileTreatmentException extends Exception {
    public FileTreatmentException(String msg) {
        super(msg);
    }

    public FileTreatmentException() {

    }
}