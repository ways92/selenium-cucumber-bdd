package util;

import org.apache.commons.lang3.StringUtils;
import java.io.FileInputStream;
import java.util.Properties;

public class operation {
    static Properties prop = new Properties();

    public static String getPropertyValue (String key) throws Exception {
//      load data from properties
        String propPath = System.getProperty("user.dir")+"/src/test/resources/data/config.properties";
        FileInputStream FIS = new FileInputStream(propPath);
        prop.load(FIS);

//      read data according to key
        String value = prop.get(key).toString();

//      appear error if key not found
        if (StringUtils.isEmpty(value)){
            throw new Exception("value is not specified for key"+key+" in properties");
        }

        return value;
    }
}
