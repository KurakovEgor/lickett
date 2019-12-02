package xyz.kurakov.grammarapi.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import xyz.kurakov.grammarapi.models.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class GrammarBotResponse {

    Software software;
    Warnings warnings;
    Language language;
    List<Match> matches = new ArrayList<>();

}
