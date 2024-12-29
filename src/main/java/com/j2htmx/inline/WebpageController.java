package com.j2htmx.inline;

import com.j2htmx.inline.nodes.canvas.Webpage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.UUID;

@RestController
public class WebpageController {

    Webpage webpage = new Webpage();

    @GetMapping("/home")
    public Flux<String> home() {
        return webpage.createHome(UUID.randomUUID().toString());
    }

    @GetMapping("/themes")
    public Flux<String> dairy() {
        return webpage.createDairy();
    }

    @GetMapping("/cases")
    public Flux<String> vegetable() {
        return webpage.createVegetable();
    }

    @GetMapping("/debunked")
    public Flux<String> snack() {
        return webpage.createSnacks();
    }

    @GetMapping("/cart")
    public Flux<String> cart() {
        return webpage.addToCart("test",23);
    }


}
