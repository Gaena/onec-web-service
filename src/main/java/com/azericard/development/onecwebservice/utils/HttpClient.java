package com.azericard.development.onecwebservice.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class HttpClient {

    private final RestTemplate restTemplate;

    public HttpClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<String> getRdfResponse(String url) {
        return restTemplate.getForEntity(url, String.class);
    }


}
