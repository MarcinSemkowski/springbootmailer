package pl.semkowski.springbootmailer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootmailerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmailerApplication.class, args);
    }

}
