package pl.altkom.properties;

import java.util.Properties;

public class ZmienneSystemowe {

    public static void main(String[] args) {
//        Properties p = System.getProperties();
//        String s = p.getProperty("user.name");
        String s = System.getProperty("user.name");
        System.out.println(s);
    }
}
