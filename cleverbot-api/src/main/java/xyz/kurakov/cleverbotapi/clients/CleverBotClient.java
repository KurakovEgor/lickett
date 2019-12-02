package xyz.kurakov.cleverbotapi.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.kurakov.cleverbotapi.config.CleverBotFeignConfiguration;
import xyz.kurakov.cleverbotapi.dto.CleverBotResponse;

import javax.ws.rs.core.MediaType;

@FeignClient(name = "clever-bot", url = "https://www.cleverbot.com", configuration = CleverBotFeignConfiguration.class)
public interface CleverBotClient {

    @GetMapping(value = "/getreply", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    CleverBotResponse getReply(@RequestParam(name = "key") String key,
                               @RequestParam(name = "input") String input,
                               @RequestParam(name = "cs") String cs);
}
