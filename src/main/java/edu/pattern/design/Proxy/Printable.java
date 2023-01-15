package edu.pattern.design.Proxy;

/**
 * Printable : Subject 로서, Proxy 와 Real 의 투과적 Interface 를 결정
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public interface Printable {
    void setPrinterName(String name);

    String getPrinterName();

    String print(String content) throws InterruptedException;
}
