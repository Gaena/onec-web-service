package com.azericard.development.onecwebservice.controller;

import com.azericard.development.onecwebservice.dto.CifMap;
import com.azericard.development.onecwebservice.dto.TerminalList;
import com.azericard.development.onecwebservice.service.CifByTerminalNumberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CifByTerminalNumberController {

    private final CifByTerminalNumberService service;

    public CifByTerminalNumberController(CifByTerminalNumberService service) {
        this.service = service;
    }

    @PostMapping(value = "/getCif", consumes = "application/json", produces = "application/json")
    public CifMap getCifNumbersByTerminalList(@RequestBody TerminalList terminalList) {
        return service.getCifNumbersByTerminalList(terminalList.getTerminalList());
    }
}
