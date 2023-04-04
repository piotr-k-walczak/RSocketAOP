package com.github.piotrkwalczak.rsocket.benchmark;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class ExampleClass {

    @MyAnnotation
    public Object getValue() {
        return "Hello, World!";
    }

    @MyAnnotation2
    public Flux<Object> getValues() {
        return Flux.interval(Duration.ofSeconds(1)).map(i ->  i + " - " + i);
    }
}
