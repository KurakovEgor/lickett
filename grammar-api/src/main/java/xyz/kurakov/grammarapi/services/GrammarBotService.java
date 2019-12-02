package xyz.kurakov.grammarapi.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.kurakov.grammarapi.clients.GrammarBotClient;
import xyz.kurakov.grammarapi.dto.GrammarBotRequest;
import xyz.kurakov.grammarapi.dto.Mistakes;
import xyz.kurakov.grammarapi.models.Mistake;
import xyz.kurakov.grammarapi.models.Replacement;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GrammarBotService {

    private final GrammarBotClient grammarBotClient;

    public Mistakes getGrammar(String text) {
        return new Mistakes().setList(
                grammarBotClient.getGrammar(new GrammarBotRequest().setText(text)).getMatches().stream().map(match ->
                        new Mistake()
                                .setDescription(match.getMessage())
                                .setShortDescription(match.getShortMessage())
                                .setOffset(match.getOffset())
                                .setLength(match.getLength())
                                .setReplacements(match.getReplacements().stream().map(Replacement::getValue).collect(Collectors.toList()))
                        ).collect(Collectors.toList())
        );
    }

}
