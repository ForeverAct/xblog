package test;

import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;

/**
 * Created by Administrator on 2017/5/7 0007.
 */
public class JUnit4ClassRunner extends SpringJUnit4ClassRunner {
    static {
        try {
            String path="/config/Log4j.xml";
            URL url=JUnit4ClassRunner.class.getResource(path);
            //System.out.print(url);
            ConfigurationSource source = new ConfigurationSource(new FileInputStream(new File(url.getPath())),url);
            Configurator.initialize(null, source);
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot Initialize log4j");
        }
    }
    public JUnit4ClassRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }
}
