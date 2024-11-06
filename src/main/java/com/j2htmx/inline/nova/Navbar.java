package com.j2htmx.inline.nova;

import com.j2htmx.inline.nodes.nodes.NodeCreator;
import com.j2htmx.inline.nodes.standard.form.Button;
import com.j2htmx.inline.nodes.standard.form.InputBox;

import java.util.UUID;

public class Navbar extends NodeCreator {
    public Navbar(){
        setTag("nav");
        setStyle("navbar");

        Button home = new Button("Home", UUID.randomUUID().toString());
        home.setStyle("button");

        Button about = new Button("Cart", UUID.randomUUID().toString());
        about.setStyle("button");


        Button content = new Button("Profile", UUID.randomUUID().toString());
        content.setStyle("button");


        setContent(home.createPairNode().concat(about.createPairNode()).concat(content.createPairNode()));
    }
}
