package xyz.kurakov.speechrecognitionapi.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import xyz.kurakov.speechrecognitionapi.dto.SpeechrecognitionResponse;
import xyz.kurakov.speechrecognitionapi.services.SpeechrecognitionService;

@RestController("/api/v1/speechrecognition")
@RequiredArgsConstructor
public class SpeechrecognitionController {

    private final SpeechrecognitionService speechrecognitionService;

    @PostMapping(value = "/recognise")
    public SpeechrecognitionResponse recogniseSpeech(@RequestBody byte[] audiofile) {
        return speechrecognitionService.recogniseAudio(audiofile);
    }
}
