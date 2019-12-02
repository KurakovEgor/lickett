package xyz.kurakov.grammarapi.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Match {

    private String message;
    private String shortMessage;
    List<Replacement> replacements = new ArrayList<>();
    private String offset;
    private String length;
    Context context;
    private String sentence;
    Type type;
    Rule rule;

}
