package online.yuluo.springservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringServerGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServerGitApplication.class, args);
    }

}
