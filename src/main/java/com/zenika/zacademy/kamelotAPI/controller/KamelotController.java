package com.zenika.zacademy.kamelotAPI.controller;

import com.zenika.zacademy.kamelotAPI.controller.dto.KamelotMapper;
import com.zenika.zacademy.kamelotAPI.controller.dto.QuoteDto;
import com.zenika.zacademy.kamelotAPI.repository.KamelotClient;
import com.zenika.zacademy.kamelotAPI.service.KamelotResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KamelotController {
    private final KamelotClient kamelotClient;
    private final KamelotMapper kamelotMapper;

    public KamelotController(KamelotClient kamelotClient, KamelotMapper kamelotMapper) {
        this.kamelotClient = kamelotClient;
        this.kamelotMapper = kamelotMapper;
    }

    @GetMapping("/quote")
    public QuoteDto getQuote (@RequestParam(required = false) Integer book, @RequestParam(required = false) String character) {
        KamelotResponse kamelotResponse = kamelotClient.getRandom(book, character);

        return kamelotMapper.kamelotResponseToQuoteDto(kamelotResponse);
    }
}
