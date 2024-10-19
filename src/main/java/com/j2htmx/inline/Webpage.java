package com.j2htmx.inline;

import com.j2htmx.inline.nodes.canvas.WebpageHandler;
import com.j2htmx.inline.nodes.standard.form.Button;
import com.j2htmx.inline.nodes.standard.form.Div;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



public class Webpage extends WebpageHandler {

    Flux<String> createHelloWorld(String clientId) {
        Button button = new Button("Hello world", clientId, "/hello-world", "body");
        add(button);
        return subscribeToFlux(clientId);
    }

    Mono<String> createHelloChanged(String clientId) {
        Div div = new Div();
        div.setContent("Is this changed?");
        return Mono.just(div.createPairNode());
    }




}
