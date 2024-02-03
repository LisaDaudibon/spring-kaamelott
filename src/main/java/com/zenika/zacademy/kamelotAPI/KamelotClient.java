package com.zenika.zacademy.kamelotAPI;

import com.zenika.zacademy.kamelotAPI.Service.KamelotResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.Option;
import java.util.Objects;
import java.util.Optional;

@Component
public class KamelotClient {
    private final KamelotConfig kamelotConfig;
    private RestTemplate restTemplate;

    public KamelotClient(KamelotConfig kamelotConfig) {
        this.kamelotConfig = kamelotConfig;
        restTemplate = new RestTemplate();
    }

    public KamelotResponse getRandom (Integer filteredBook, String filteredCharacter) throws RestClientException {
        String filterBookUrl = Objects.nonNull(filteredBook) ? "/livre/" + filteredBook : "";
        String filterCharacterUrl = Objects.nonNull(filteredCharacter) ? "/personnage/" + filteredCharacter : "";

        KamelotResponse response = restTemplate.getForObject(kamelotConfig.getUrl() + "/random" + filterBookUrl + filterCharacterUrl
                , KamelotResponse.class);

        if (response == null || response.getStatus() != 1) {
            throw new RestClientException("No data found in Kaamelott API");
        }

        return response;
    }
}
