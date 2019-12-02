package xyz.kurakov.speechrecognitionapi.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.kurakov.speechrecognitionapi.config.SpeechrecognitionFeignConfiguration;
import xyz.kurakov.speechrecognitionapi.dto.SpeechrecognitionResponse;

import javax.ws.rs.core.MediaType;

@FeignClient(name = "speechrecognition", url = "https://stt.api.cloud.yandex.net/speech/v1/", configuration = SpeechrecognitionFeignConfiguration.class)
public interface SpeechrecognitionClient {

    //TODO check transfer-encoding: chunked header
    @GetMapping(value = "/stt:recognize", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    SpeechrecognitionResponse recognise(@RequestHeader("Authorization") String authorization,
                                        @RequestParam(name = "lang") String lang,
                                        @RequestBody byte[] audio);
}
