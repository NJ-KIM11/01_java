package main.java.com.ohgiraffers.section03.map.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application02 {
    public static void main(String[] args) {

        /*
        * Properties
        *
        * */

        Properties prop = new Properties();
        prop.setProperty("driver", "mysql.jdbc.driver.mysql");
        prop.setProperty("url", "localhost");
        prop.setProperty("user", "user");
        prop.setProperty("pass", "pass");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("driver.bat"),"jdbcDriver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
