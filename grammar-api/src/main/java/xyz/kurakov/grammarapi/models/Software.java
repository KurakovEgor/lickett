package xyz.kurakov.grammarapi.models;

import lombok.Data;

@Data
public class Software {

    private String name;
    private String version;
    private float apiVersion;
    private boolean premium;
    private String premiumHint;
    private String status;

}
