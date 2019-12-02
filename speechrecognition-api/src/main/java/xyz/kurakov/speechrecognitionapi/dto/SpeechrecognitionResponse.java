package xyz.kurakov.speechrecognitionapi.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SpeechrecognitionResponse {

    String result;
}
