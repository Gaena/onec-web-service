package com.azericard.development.onecwebservice.service;

import com.azericard.development.onecwebservice.dto.Status;
import com.azericard.development.onecwebservice.utils.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContractStatusService {

    private final HttpClient httpClient;

    public ContractStatusService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Status getContactStatus(String contractNumber) {
        log.info("Incoming contract number : {}", contractNumber);
        //TODO call RDF
        return new Status("Waiting");
    }
}
