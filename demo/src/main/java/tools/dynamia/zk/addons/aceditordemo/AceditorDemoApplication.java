package tools.dynamia.zk.addons.aceditordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.stereotype.Controller;

@SpringBootApplication(exclude = GsonAutoConfiguration.class)
public class AceditorDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AceditorDemoApplication.class, args);
    }
}
