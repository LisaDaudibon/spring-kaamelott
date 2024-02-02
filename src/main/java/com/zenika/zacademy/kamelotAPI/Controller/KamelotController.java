package com.zenika.zacademy.kamelotAPI.Controller;

import com.zenika.zacademy.kamelotAPI.KamelotClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KamelotController {
    private final KamelotClient kamelotClient;


    public KamelotController(KamelotClient kamelotClient) {
        this.kamelotClient = kamelotClient;
    }

    @GetMapping("/quote")
    public void getQuote () {
        this.kamelotClient.getRandom();
    }
}
