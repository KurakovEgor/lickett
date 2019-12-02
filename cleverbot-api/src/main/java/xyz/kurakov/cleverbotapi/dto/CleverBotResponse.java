package xyz.kurakov.cleverbotapi.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CleverBotResponse {

    String output;
    String cs;
}
