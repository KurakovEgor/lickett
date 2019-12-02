package xyz.kurakov.grammarapi.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.kurakov.grammarapi.dto.Mistakes;
import xyz.kurakov.grammarapi.services.GrammarBotService;

@RestController("/api/v1/grammar")
@RequiredArgsConstructor
public class GrammarController {

    private final GrammarBotService grammarBotService;

    @GetMapping("/check")
    public Mistakes getGrammar(@RequestParam String text) {
        return grammarBotService.getGrammar(text);
    }

}
