package com.javaPrep.backend.beans.exam;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ExamWebClient {

    WebClient client = WebClient.create("http://localhost:8080");

    public void consume() {

        Mono<Exam> examMono = client.get()
                .uri("/exam/{id}", "1")
                .retrieve()
                .bodyToMono(Exam.class);

        examMono.subscribe(System.out::println);

        Flux<Exam> examFlux = client.get()
                .uri("/exam")
                .retrieve()
                .bodyToFlux(Exam.class);

        examFlux.subscribe(System.out::println);
    }
}