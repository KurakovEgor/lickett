package xyz.kurakov.grammarapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GrammarBotRequest {

    @JsonProperty("api_key")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String apiKey;
    private String language = "en-US";
    private String text;

}
