package com.javaPrep.backend.beans.topic;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/topics")
public class TopicController {

    private final com.javaPrep.backend.beans.topic.TopicRepository topicRepository;

    public TopicController(com.javaPrep.backend.beans.topic.TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    // constructor...

    @GetMapping("/{id}")
    private Mono<Topic> getTopicById(@PathVariable String id) {
        return topicRepository.findTopicById(id);
    }

    @GetMapping
    private Flux<Topic> getAllTopics() {
        return topicRepository.findAllTopics();
    }

}