package xyz.kurakov.speechrecognitionapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpeechrecognitionApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeechrecognitionApiApplication.class, args);
    }

}
