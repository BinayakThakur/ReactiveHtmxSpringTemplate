package com.j2htmx.inline.nodes.canvas;

import com.j2htmx.inline.nova.Home;
import reactor.core.publisher.Flux;

public class Webpage extends WebpageHandler {
    //add(...) to add components
    //provide client ID, for server side tracking of components
   //Web page design
    public Flux<String> createHome(String clientId) {
        Home home = new Home();
        add(home);
        return subscribeToFlux(clientId);
    }





}
