package com.j2htmx.inline.nodes.canvas;

import com.j2htmx.inline.nodes.nodes.NodeCreator;
import com.j2htmx.inline.nodes.standard.form.Button;
import com.j2htmx.inline.nodes.standard.table.Table;
import com.j2htmx.inline.nova.Card;
import com.j2htmx.inline.nova.Home;
import com.j2htmx.inline.repository.ButtonRepository;
import com.j2htmx.inline.repository.ThemeRepository;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Webpage extends WebpageHandler {
    ButtonRepository buttonRepository = new ButtonRepository();
    ThemeRepository themeRepository = new ThemeRepository();
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
            card.init("Lorem-ipsum", "Lorem-ipsum", "Case");
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
        Table table = new Table();

        Button btn1Apple = new Button("Apple", "btn1-apple");
        btn1Apple.setHxPost("/btn1-apple");
        btn1Apple.setHxTarget("#parent-div");

        Button btn1Cyberpunk = new Button("Cyberpunk", "btn1-cyberpunk");
        btn1Cyberpunk.setHxPost("/btn1-cyberpunk");
        btn1Cyberpunk.setHxTarget("#parent-div");

        Button btn1Vintage = new Button("Vintage", "btn1-vintage");
        btn1Vintage.setHxTarget("#parent-div");
        btn1Vintage.setHxPost("/btn1-vintage");

        Button btn1Modern = new Button("Modern", "btn1-modern");
        btn1Modern.setHxTarget("#parent-div");
        btn1Modern.setHxPost("/btn1-modern");

        Button btn1Win98 = new Button("Windows 98", "btn1-windows-98");
        btn1Win98.setHxTarget("#parent-div");
        btn1Win98.setHxPost("/btn1-windows-98");

        Button btn1Nokia = new Button("Nokia", "btn1-nokia");
        btn1Nokia.setHxTarget("#parent-div");
        btn1Nokia.setHxPost("/btn1-nokia");

        Button btn1Neon = new Button("Neon", "btn1-neon");
        btn1Neon.setHxTarget("#parent-div");
        btn1Neon.setHxPost("/btn1-neon");

        Button btn1PopRock = new Button("Pop Rock", "btn1-pop-rock");
        btn1PopRock.setHxTarget("#parent-div");
        btn1PopRock.setHxPost("/btn1-pop-rock");

        table.addData(List.of(btn1Neon.createPairNode(),btn1Cyberpunk.createPairNode(),btn1Apple.createPairNode(),btn1Vintage.createPairNode(),btn1Nokia.createPairNode(),btn1Modern.createPairNode(),btn1PopRock.createPairNode(),btn1Win98.createPairNode()));
        elements.add(table.createPairNode());
        return Flux.fromIterable(elements);
    }

    public Flux<String> createSnacks() {
        List<String> elements = new ArrayList<>();
        Table dairyItems = new Table();

        for (int i = 1 ; i<= 40 ; i++) {
            Card card = new Card();
            card.setClass(themeRepository.getTheme());
            card.init("Lorem ipsum !", "Lorem ipsum !", "DEBUNKED");
            elements.add(card.createPairNode());
            if (i % 4 == 0) {
                dairyItems.addData(elements);
                elements.clear();
            }
        }
        elements.add(dairyItems.createPairNode());
        return Flux.fromIterable(elements);
    }

    public Flux<String> addToCart(String name, Integer price) {
        List<String> elements = new ArrayList<>();
        buttonRepository.addToCart(name,"");
        elements.add(buttonRepository.getCart());
        return Flux.fromIterable(elements);
    }





}
