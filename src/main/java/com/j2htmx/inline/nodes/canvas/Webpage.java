package com.j2htmx.inline.nodes.canvas;

import com.j2htmx.inline.nodes.nodes.NodeCreator;
import com.j2htmx.inline.nodes.standard.form.Button;
import com.j2htmx.inline.nodes.standard.table.Table;
import com.j2htmx.inline.nova.Card;
import com.j2htmx.inline.nova.Home;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Webpage extends WebpageHandler {
    //add(...) to add components
    //provide client ID, for server side tracking of components
   //Web page design
    public Flux<String> createHome(String clientId) {
        Home home = new Home();
        //combine add to subscribe to flux later
        add(home);
        return subscribeToFlux(clientId);
    }

    public Flux<String> createVegetable() {
        List<String> elements = new ArrayList<>();
        Table dairyItems = new Table();

        for (int i = 1 ; i<= 40 ; i++) {
            Card card = new Card();
            card.init("Lorem-ipsum", "Lorem-ipsum", "BUY");
            elements.add(card.createPairNode());
            if (i % 4 == 0) {
                dairyItems.addData(elements);
                elements.clear();
            }
        }
        elements.add(dairyItems.createPairNode());
        return Flux.fromIterable(elements);
    }

    public Flux<String> createDairy() {
        List<String> elements = new ArrayList<>();
        Table dairyItems = new Table();

        for (int i = 1 ; i<= 40 ; i++) {
            Card card = new Card();
            card.init("Lorem ipsum", "Lorem ipsum", "BUY");
            elements.add(card.createPairNode());
            if (i % 4 == 0) {
                dairyItems.addData(elements);
                elements.clear();
            }
        }
        elements.add(dairyItems.createPairNode());
        return Flux.fromIterable(elements);
    }

    public Flux<String> createSnacks() {
        List<String> elements = new ArrayList<>();
        Table dairyItems = new Table();

        for (int i = 1 ; i<= 40 ; i++) {
            Card card = new Card();
            card.init("Lorem ipsum !", "Lorem ipsum !", "BUY");
            elements.add(card.createPairNode());
            if (i % 4 == 0) {
                dairyItems.addData(elements);
                elements.clear();
            }
        }
        elements.add(dairyItems.createPairNode());
        return Flux.fromIterable(elements);
    }





}
