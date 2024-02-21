package base;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    Properties properties = new Properties();

    public PropertiesUtil() {
        try {
            properties = this.loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Properties loadProperties() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("testdata.properties");
        Properties props = new Properties();
        try {
            props.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return props;
    }

    public String getProperty(String property) throws IOException {
        return this.properties.getProperty(property);

    }
}
