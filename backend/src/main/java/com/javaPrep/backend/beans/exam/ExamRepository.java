package com.javaPrep.backend.beans.exam;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ExamRepository {

    static Map<String,Exam> examData;

    static Map<String,String> examAccessData;

    static
    {
        examData = new HashMap<>();
        examData.put("1",new Exam(1, "Java SE 11 Programmer I", "1Z0-815", "multiple choice", 180, 80, 63.0,"java11", "https://education.oracle.com/java-se-11-programmer-i/pexam_1Z0-815"));
        examData.put("2",new Exam(2, "Java SE 11 Programmer II", "1Z0-816", "multiple choice", 180, 80, 63.0,"java11", "https://education.oracle.com/java-se-11-programmer-ii/pexam_1Z0-816"));



        examAccessData=new HashMap<>();
        examAccessData.put("1", "Exam 1 Access Key");
        examAccessData.put("2", "Exam 2 Access Key");
    }

    public Mono<Exam> findExamById(String id)
    {
        return Mono.just(examData.get(id));
    }

    public Flux<Exam> findAllExams()
    {
        return Flux.fromIterable(examData.values());
    }

    public Mono<Exam> updateExam(Exam exam)
    {
        Exam existingExam=examData.get(exam.getId());
        if(existingExam!=null)
        {
            existingExam.setExamTitle(exam.getExamTitle());
        }
        return Mono.just(existingExam);
    }
}