package xyz.kurakov.speechrecognitionapi.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import xyz.kurakov.speechrecognitionapi.clients.SpeechrecognitionClient;
import xyz.kurakov.speechrecognitionapi.dto.SpeechrecognitionResponse;

@Service
@RequiredArgsConstructor
public class SpeechrecognitionService {

    private final SpeechrecognitionClient speechrecognitionClient;

    @Value("${speechrecognition.iam}")
    private String key;

    @Value("${speechrecognition.lang}")
    private String lang;

    public SpeechrecognitionResponse recogniseAudio(byte[] audio) {
        return speechrecognitionClient.recognise(key, lang, audio);
    }
}
