package edu.pattern.design.Proxy;

import lombok.Getter;

import java.util.Objects;

/**
 * ProxyPrinter : Virtual Proxy 로서, Printer 가 실제 필요하기 전까지 생성하지 않는다
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class ProxyPrinter implements Printable {
    @Getter private Printer real;
    private String name;

    public ProxyPrinter(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        this.name = name;
        if (Objects.nonNull(real)) {
            this.real.setPrinterName(name);
        }
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public String print(String content) throws InterruptedException {
        if (Objects.isNull(real)) {
            realize();
        }
        return real.print(content);
    }

    private synchronized void realize() {
        this.real = new Printer(name);
    }
}