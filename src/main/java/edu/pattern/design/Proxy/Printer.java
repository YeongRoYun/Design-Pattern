package edu.pattern.design.Proxy;

/**
 * Printer : Real Subject 로서, 무거운 작업을 수행한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class Printer implements Printable {
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public synchronized String print(String content) throws InterruptedException {
        heavyJob();
        return content;
    }

    private synchronized void heavyJob() throws InterruptedException {
        Thread.sleep(5000);
    }
}