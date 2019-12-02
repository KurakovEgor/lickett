package xyz.kurakov.grammarapi.models;

import lombok.Data;

@Data
public class Language {

    private String name;
    private String code;
    DetectedLanguage detectedLanguage;

}
