package com.github.piotrkwalczak.rsocket.benchmark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class Controller {

    @Autowired
    public ExampleClass exampleClass;

    @GetMapping("/")
    public Object get() {
        return exampleClass.getValue();
    }
}
