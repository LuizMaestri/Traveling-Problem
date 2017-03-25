package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author luiz
 * @since 24/03/17
 */
public class Config {
    private Properties prop;

    public Config() {
        this.setProp(new Properties());
        String fileName = "config.properties";
        InputStream stream = getClass().getClassLoader().getResourceAsStream(fileName);
        try {
            this.prop.load(stream);
        } catch (IOException | NullPointerException e) {
            System.out.println("Problems with config file: " + fileName);
        }
    }

    private void setProp(Properties prop) {
        this.prop = prop;
    }

    private Properties getProp() {
        return this.prop;
    }

    public String getProperty(String prop){
        return this.getProp().getProperty(prop);
    }
}
