package com.github.piotrkwalczak.rsocket.benchmark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

@Controller
public class RSocketController {

    @Autowired
    private ExampleClass exampleClass;

    @RequestMapping("/s")
    public Flux<Object> gets() {
        return exampleClass.getValues();
    }
}
