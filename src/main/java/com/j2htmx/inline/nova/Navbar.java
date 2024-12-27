package com.j2htmx.inline.nova;

import com.j2htmx.inline.nodes.nodes.NodeCreator;
import com.j2htmx.inline.nodes.standard.form.Button;
import com.j2htmx.inline.nodes.standard.form.InputBox;

import java.util.UUID;

public class Navbar extends NodeCreator {
    public Navbar(){
        setTag("nav");
        setStyle("navbar");

        Button home = new Button("Watchlist", UUID.randomUUID().toString());
        home.setStyle("button-warning");

        Button about = new Button("Trends", UUID.randomUUID().toString());
        about.setStyle("button-dark");


        Button content = new Button("Events", UUID.randomUUID().toString());
        content.setStyle("button-primary");


        setContent(home.createPairNode().concat(about.createPairNode()).concat(content.createPairNode()));
    }
}
