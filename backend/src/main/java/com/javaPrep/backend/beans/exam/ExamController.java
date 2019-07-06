package com.javaPrep.backend.beans.exam;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/exam")
public class ExamController {

    private final com.javaPrep.backend.beans.exam.ExamRepository examRepository;

    public ExamController(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    // constructor...

    @GetMapping("/{id}")
    private Mono<Exam> getExamById(@PathVariable String id) {
        return examRepository.findExamById(id);
    }

    @GetMapping
    private Flux<Exam> getAllExams() {
        return examRepository.findAllExams();
    }

    @PostMapping("/update")
    private Mono<Exam> updateExam(@RequestBody Exam exam) {
        return examRepository.updateExam(exam);
    }
}