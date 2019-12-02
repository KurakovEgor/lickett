package xyz.kurakov.cleverbotapi.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.kurakov.cleverbotapi.dto.CleverBotResponse;
import xyz.kurakov.cleverbotapi.services.CleverBotService;

@RestController("/api/v1/cleverbot")
@RequiredArgsConstructor
public class CleverbotController {

    private final CleverBotService cleverBotService;

    @GetMapping("/answer")
    public CleverBotResponse getCleverbotAnser(@RequestParam(name = "question") String question,
                                               @RequestParam(name = "cs", required = false) String cs) {
        return cleverBotService.getCleverbotAnswer(question, cs);
    }
}
