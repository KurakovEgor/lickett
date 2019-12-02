package xyz.kurakov.grammarapi.models;

import lombok.Data;

@Data
public class Context {

    private String text;
    private float offset;
    private float length;

}
