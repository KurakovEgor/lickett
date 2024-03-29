package xyz.kurakov.grammarapi;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class GrammarApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrammarApiApplication.class, args);
    }

}
