package xyz.kurakov.grammarapi.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import xyz.kurakov.grammarapi.config.GrammarBotFeignConfiguration;
import xyz.kurakov.grammarapi.dto.GrammarBotRequest;
import xyz.kurakov.grammarapi.dto.GrammarBotResponse;

import javax.ws.rs.core.MediaType;

@FeignClient(name = "grammar-bot", url = "http://api.grammarbot.io/v2", configuration = GrammarBotFeignConfiguration.class)
public interface GrammarBotClient {

    @PostMapping(value = "/check", consumes = MediaType.APPLICATION_FORM_URLENCODED, produces = MediaType.APPLICATION_JSON)
    GrammarBotResponse getGrammar(GrammarBotRequest grammarBotRequest);

}
