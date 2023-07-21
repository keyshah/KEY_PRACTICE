package Bunch.readwritepropertiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readwritepropertiesfile {

    public static void main(String[] args) throws IOException {
        File src = new File("./testdata/config.properties");
        FileInputStream fis = new FileInputStream(src);
        Properties prop = new Properties();
        prop.load(fis);

        System.out.println(prop.getProperty("username"));
    }
}
