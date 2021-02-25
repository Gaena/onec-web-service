package com.azericard.development.onecwebservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CifMap {

    @JsonProperty("cifMap")
    private Map<String ,String> map;
}
