package xyz.kurakov.cleverbotapi.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import xyz.kurakov.cleverbotapi.clients.CleverBotClient;
import xyz.kurakov.cleverbotapi.dto.CleverBotResponse;

@Service
@RequiredArgsConstructor
public class CleverBotService {

    private final CleverBotClient cleverBotClient;

    @Value("${cleverbot.key}")
    private String key;

    public CleverBotResponse getCleverbotAnswer(String question, String cleverbotState) {
        return cleverBotClient.getReply(key, question, cleverbotState);
    }
}
