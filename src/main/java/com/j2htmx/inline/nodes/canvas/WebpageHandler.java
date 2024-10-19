package com.j2htmx.inline.nodes.canvas;

import com.j2htmx.inline.nodes.nodes.NodeCreator;
import com.j2htmx.inline.nodes.structure.Brush;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Sinks;

import java.util.function.Consumer;


@Slf4j
public abstract class WebpageHandler extends Brush {
    private static final Logger log = LoggerFactory.getLogger(WebpageHandler.class);
    //Using sink
    Sinks.Many<NodeCreator> nodes = Sinks.many().multicast().onBackpressureBuffer();

    public Flux<String> subscribeToFlux(String clientId) {
        return  nodes.asFlux()
                .doOnNext(node -> log.debug("A node was added by client : {}", clientId))
                .flatMap(this::init)
                .doOnNext(node -> this.nodes.tryEmitComplete())
                .doFinally(emitSignal -> nodes = Sinks.many().multicast().onBackpressureBuffer());

    }



    public void add(NodeCreator nodeCreator) {
        nodes.tryEmitNext(nodeCreator);
    }
}
