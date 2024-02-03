package com.zenika.zacademy.kamelotAPI.Controller.dto;

import com.zenika.zacademy.kamelotAPI.Service.KamelotResponse;
import org.springframework.stereotype.Component;

@Component
public class KamelotMapper {
    public QuoteDto kamelotResponseToQuoteDto (KamelotResponse kamelotResponse){
        return new QuoteDto(kamelotResponse.getCitation().getCitation(), kamelotResponse.getCitation().getInfos().getPersonnage(), kamelotResponse.getCitation().getInfos().getSaison(), kamelotResponse.getCitation().getInfos().getEpisode());
    }
}
