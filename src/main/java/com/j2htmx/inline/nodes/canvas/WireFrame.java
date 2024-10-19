package com.j2htmx.inline.nodes.canvas;


import com.j2htmx.inline.nodes.nodes.NodeCreator;
import reactor.core.publisher.Mono;

import java.util.HashMap;

public abstract class WireFrame {
    protected Mono<String> page = Mono.empty();
    protected static String title;
    protected HashMap<Object, String> registry = new HashMap<>();
    protected String head = "<head><script src=\"https://unpkg.com/htmx.org@2.0.3\"></script></head>";
    public Mono<String> init(NodeCreator nodeCreator) {
      page = Mono.just(registry.getOrDefault(nodeCreator.getClientId(), head.concat(nodeCreator.createPairNode())));
      return page;
    }
}
