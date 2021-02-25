package com.azericard.development.onecwebservice.service;

import com.azericard.development.onecwebservice.dto.CifMap;
import com.azericard.development.onecwebservice.utils.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class CifByTerminalNumberService {

    private final HttpClient httpClient;

    public CifByTerminalNumberService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }
    public CifMap getCifNumbersByTerminalList(List<String> terminalList) {
        log.info("Terminal list : {}", terminalList);
        Map<String, String> responseMap = new HashMap<>();

        //TODO get data from RDF

        for (String terminal : terminalList) {
            responseMap.put(terminal , "test");
        }

        log.info("Response map : {}" , responseMap);
        return new CifMap(responseMap);
    }
}
