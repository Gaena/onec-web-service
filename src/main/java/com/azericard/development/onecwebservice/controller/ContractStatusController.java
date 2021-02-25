package com.azericard.development.onecwebservice.controller;

import com.azericard.development.onecwebservice.dto.Status;
import com.azericard.development.onecwebservice.service.ContractStatusService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractStatusController {

    private final ContractStatusService service;

    public ContractStatusController(ContractStatusService service) {
        this.service = service;
    }

    @PostMapping(value = "/contractStatus/{contractNumber}", produces = "application/json")
    public Status getContractStatus(@PathVariable String contractNumber) {
        return service.getContactStatus(contractNumber);
    }
}
