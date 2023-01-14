package edu.pattern.design.Facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Database : Facade 에 사용되는 클래스로, Method 를 정해진 절차로 호출해야 한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public class Database {
    private Database() {

    }

    public static Properties getProperties(String filename) throws RuntimeException {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            throw new RuntimeException(String.format("%s Not Found", filename));
        }
        return prop;
    }
}