package com.zenika.zacademy.kamelotAPI.Controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuoteDto {
    private String citation;
    private String personnage;
    private String saison;
    private String episode;

    public QuoteDto(String citation, String personnage, String saison, String episode) {
        this.citation = citation;
        this.personnage = personnage;
        this.saison = saison;
        this.episode = episode;
    }
}
