package com.azericard.development.onecwebservice.service;

import com.azericard.development.onecwebservice.dto.TerminalList;
import com.azericard.development.onecwebservice.utils.Utils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CifByTerminalNumberServiceTest {

    @Test
    void getCifNumbersByTerminalList() {
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("test");
        list.add("test");

        TerminalList terminalList = new TerminalList();
        terminalList.setTerminalList(list);

        System.out.println(Utils.objectToString(terminalList));
    }
}