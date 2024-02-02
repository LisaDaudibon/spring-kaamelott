package com.zenika.zacademy.kamelotAPI;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class KamelotClient {
    private final KamelotConfig kamelotConfig;
    private RestTemplate restTemplate;

    public KamelotClient(KamelotConfig kamelotConfig) {
        this.kamelotConfig = kamelotConfig;
        restTemplate = new RestTemplate();
    }

    public void getRandom () {
        restTemplate.getForObject(kamelotConfig.getUrl() + "/random", String.class);
    }
}
