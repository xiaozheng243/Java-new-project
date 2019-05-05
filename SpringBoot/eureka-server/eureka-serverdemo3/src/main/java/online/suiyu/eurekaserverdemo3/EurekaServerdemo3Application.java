package online.suiyu.eurekaserverdemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerdemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerdemo3Application.class, args);
    }
}
