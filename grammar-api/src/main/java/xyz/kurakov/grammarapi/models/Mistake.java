package xyz.kurakov.grammarapi.models;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Mistake {

    private String description;
    private String shortDescription;
    private List<String> replacements;
    private String offset;
    private String length;

}
