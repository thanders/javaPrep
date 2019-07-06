package com.javaPrep.backend.beans.topic;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class TopicWebClient {

    WebClient client = WebClient.create("http://localhost:8080");

    public void consume() {

        Mono<Topic> employeeMono = client.get()
                .uri("/topics/{id}", "1")
                .retrieve()
                .bodyToMono(Topic.class);

        employeeMono.subscribe(System.out::println);

        Flux<Topic> employeeFlux = client.get()
                .uri("/topics")
                .retrieve()
                .bodyToFlux(Topic.class);

        employeeFlux.subscribe(System.out::println);
    }
}