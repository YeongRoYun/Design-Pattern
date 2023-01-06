package edu.pattern.design.ChainOfResponsibility;

/**
 * Trouble : Client 의 Request
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/06
 **/
public record Trouble(Integer id) {

    @Override
    public String toString() {
        return String.format("[Trouble %3d]", id);
    }
}