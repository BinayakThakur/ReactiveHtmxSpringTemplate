package com.j2htmx.inline;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
public class WebpageController {

    Webpage webpage = new Webpage();

    @GetMapping("")
    public Flux<String> boot() {
        return webpage.createHelloWorld(UUID.randomUUID().toString());
    }

    @GetMapping("/hello-world")
    public Mono<String> getHello() {
        return webpage.createHelloChanged(UUID.randomUUID().toString());
    }
}
