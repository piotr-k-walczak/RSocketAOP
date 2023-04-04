package com.github.piotrkwalczak.rsocket.benchmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.rsocket.RSocketRequester;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class RSocketCLI {
    public static void main(String[] args) {
        RSocketRequester rSocketRequester = RSocketRequester.builder()
                        .tcp("localhost", 8080);

        rSocketRequester.route("s")
                .retrieveFlux(String.class)
                .subscribe(payload -> System.out.println("" + payload));

        SpringApplication.run(RSocketCLI.class);
    }
}
