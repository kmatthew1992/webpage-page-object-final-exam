package eu.michaelclement.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UrlReader {
    public static String getUrl(URLs url) {
        Properties properties = new Properties();

        try(FileInputStream fileInputStream = new FileInputStream("src/test/resources/urls.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        switch (url) {
            case LOGIN -> {
                return properties.getProperty("login_page");
            }
            case PRODUCTS -> {
                return properties.getProperty("products_page");
            }
            case CONTACT -> {
                return properties.getProperty("contact_page");
            }
            case CART -> {
                return properties.getProperty("cart_page");
            }
            default -> throw new RuntimeException();
        }

    }
}
