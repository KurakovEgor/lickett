package xyz.kurakov.grammarapi.models;

import lombok.Data;

@Data
public class Rule {

    private String id;
    private String description;
    private String issueType;
    Category category;

}
