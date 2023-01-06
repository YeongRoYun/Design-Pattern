package edu.pattern.design.Composite;

/**
 * FileTreatmentException : File 에 add 연산을 수행할 때 발생하는 예외
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public class FileTreatmentException extends Exception {
    FileTreatmentException() {
    }

    FileTreatmentException(String msg) {
        super(msg);
    }
}