package xyz.kurakov.cleverbotapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CleverbotApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleverbotApiApplication.class, args);
    }

}
