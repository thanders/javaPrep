package com.javaPrep.backend.beans.topic;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TopicRepository {

    static Map<String, Topic> topicData;


    {
        topicData = new HashMap<>();
        ArrayList<String> st0 = new ArrayList<String>();
        st0.add("Describe Java Technology and the Java development environment");
        st0.add("Identify key features of the Java language");
        topicData.put("0",new Topic(0, "1Z0-815", "Understanding Java Technology  and environment", st0));

        ArrayList<String> st1 = new ArrayList<String>();
        st1.add("Declare and initialize variables (including casting and promoting primitive data types)");
        st1.add("Identify the scope of variables");
        st1.add("Use local variable type inference");
        st1.add("Create and manipulate Strings");
        st1.add("Manipulate data using the StringBuilder class and its methods");
        topicData.put("1",new Topic(1, "1Z0-815", "Working With Java Primitive Data Types and String APIs", st1));

        ArrayList<String> st2 = new ArrayList<String>();
        st2.add("Declare, instantiate, initialize and use a one-dimensional array");
        st2.add("Declare, instantiate, initialize and use two-dimensional array");
        topicData.put("2",new Topic(2,"1Z0-815","Working with Java Arrays", st2));

        ArrayList<String> st3 = new ArrayList<String>();
        st3.add("Create methods and constructors with arguments and return values");
        st3.add("Create and invoke overloaded methods");
        st3.add("Apply the static keyword to methods and fields");
        topicData.put("3",new Topic(3,"1Z0-815","Creating and Using Methods", st3));

        ArrayList<String> st4 = new ArrayList<String>();
        st4.add("Create and use subclasses and superclasses");
        st4.add("Create and extend abstract classes");
        st4.add("Enable polymorphism by overriding methods");
        st4.add("Utilize polymorphism to cast and call methods, differentiating object type versus reference type");
        st4.add("Distinguish overloading, overriding, and hiding");
        topicData.put("4",new Topic(4,"1Z0-815","Reusing Implementations Through Inheritance", st4));

        ArrayList<String> st5 = new ArrayList<String>();
        st5.add("Describe the advantages of Exception handling and differentiate among checked, unchecked exceptions, and Errors");
        st5.add("Create try-catch blocks and determine how exceptions alter program flow");
        st5.add("Create and invoke a method that throws an exception");
        topicData.put("5",new Topic(5,"1Z0-815","Handling Exceptions", st5));

        ArrayList<String> st6 = new ArrayList<String>();
        st6.add("Create an executable Java program with a main class");
        st6.add("Compile and run a Java program from the command line");
        st6.add("Create and import packages");
        topicData.put("6",new Topic(6,"1Z0-815","Creating a Simple Java Program", st6));

        ArrayList<String> st7 = new ArrayList<String>();
        st7.add("Use Java operators including the use of parenthesis to override operator precedence");
        st7.add("Use Java control statements including if, if/else, switch");
        st7.add("Create and use do/while, while, for and for each loops, including nested loops, use break and continue statements");
        topicData.put("7",new Topic(7,"1Z0-815","Using Operators and Decision Constructs", st7));

        ArrayList<String> st8 = new ArrayList<String>();
        st8.add("Declare and instantiate Java objects, and explain objects' lifecycles (including creation, dereferencing by reassignment, and garbage collection)");
        st8.add("Define the structure of a Java class");
        st8.add("Read or write to object fields");
        topicData.put("8",new Topic(8,"1Z0-815","Describing and Using Objects and Classes", st8));

        ArrayList<String> st9 = new ArrayList<String>();
        st9.add("Apply access modifiers");
        st9.add("Apply encapsulation principles to a class");
        topicData.put("9",new Topic(9,"1Z0-815","Applying Encapsulation", st9));

        ArrayList<String> st10 = new ArrayList<String>();
        st10.add("Create and implement interfaces");
        st10.add("Distinguish class inheritance from interface inheritance including abstract classes");
        st10.add("Declare and use List and ArrayList instances");
        st10.add("Understanding Lambda Expressions");
        topicData.put("10",new Topic(10,"1Z0-815","Programming Abstractly Through Interfaces", st10));

        ArrayList<String> st11 = new ArrayList<String>();
        st11.add("Describe the Modular JDK");
        st11.add("Declare modules and enable access between modules");
        st11.add("Describe how a modular project is compiled and run");
        topicData.put("11",new Topic(11,"1Z0-815","Understanding Modules", st11));

        // exam "1Z0-816"

        ArrayList<String> st12 = new ArrayList<String>();
        st12.add("Create and use final classes");
        st12.add("Create and use inner, nested and anonymous classes");
        st12.add("Create and use enumerations");
        topicData.put("12",new Topic(12,"1Z0-816","Java Fundamentals", st12));

        ArrayList<String> st13 = new ArrayList<String>();
        st13.add("Create and use interfaces with default methods");
        st13.add("Create and use interfaces with private methods");
        topicData.put("13",new Topic(13,"1Z0-816","Java Interfaces", st13));

        ArrayList<String> st14 = new ArrayList<String>();
        st14.add("Define and write functional interfaces");
        st14.add("Create and use lambda expressions including statement lambdas, local-variable for lambda parameters");
        topicData.put("14",new Topic(14,"1Z0-816","Functional Interface and Lambda Expressions", st14));

        ArrayList<String> st15 = new ArrayList<String>();
        st15.add("Use interfaces from java.util.function package");
        st15.add("Use core functional interfaces including Predicate, Consumer, Function and Supplier");
        st15.add("Use primitive and binary variations of base interfaces of java.util.function package");
        topicData.put("15",new Topic(15,"1Z0-816","Built-in Functional Interfaces", st15));

        ArrayList<String> st16 = new ArrayList<String>();
        st16.add("Migrate the application developed using a Java version prior to SE 9 to SE 11 including top-down and bottom-up migration, splitting a Java SE 8 application into modules for migration");
        st16.add("Run a modulaized application on classpath and on modulepath");
        st16.add("Use jdeps to determine dependencies and identify way to address the cyclic dependencies");
        topicData.put("16",new Topic(16,"1Z0-816","Migration to a Modular Application", st16));

        ArrayList<String> st17 = new ArrayList<String>();
        st17.add("Create worker threads using Runnable, Callable and use an ExecutorService to concurrently execute tasks");
        st17.add("Use java.util.concurrent collections and classes including CyclicBarrier and CopyOnWriteArrayList");
        st17.add("Write thread-safe code");
        st17.add("Identify threading problems such as deadlocks and livelocks");
        topicData.put("17",new Topic(17,"1Z0-816","Concurrency", st17));

        ArrayList<String> st18 = new ArrayList<String>();
        st18.add("Read data from and write console and file data using I/O Streams");
        st18.add("Use I/O Streams to read and write files");
        st18.add("Read and write objects by using serialization");
        st18.add("Use Path interface to operate on file and directory paths");
        st18.add("Use Files class to check, delete, copy or move a file or directory");
        st18.add("Use Stream API with Files");
        topicData.put("18",new Topic(18,"1Z0-816","I/O (Fundamentals and NIO2)", st18));

        ArrayList<String> st19 = new ArrayList<String>();
        st19.add("Connect to databases using JDBC URLs and DriverManager");
        st19.add("Use PreparedStatement to perform CRUD operations");
        st19.add("Use PreparedStatement and CallableStatement APIs to perform database operations");
        topicData.put("19",new Topic(19,"1Z0-816","Database Applications with JDBC", st19));

        ArrayList<String> st20 = new ArrayList<String>();
        st20.add("Describe the purpose of annotations and typical usage patterns");
        st20.add("Apply annotations to classes and methods");
        st20.add("Describe commonly used annotations in the JDK");
        st20.add("Declare custom annotations");
        topicData.put("20",new Topic(20,"1Z0-816","Annotations", st20));
    }

    public Mono<Topic> findTopicById(String id) {
        return Mono.just(topicData.get(id));
    }

    public Flux<Topic> findAllTopics() {
        return Flux.fromIterable(topicData.values());
    }

}