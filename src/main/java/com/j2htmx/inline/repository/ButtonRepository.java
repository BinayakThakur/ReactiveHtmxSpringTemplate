package com.j2htmx.inline.repository;

import com.j2htmx.inline.nodes.standard.table.Table;
import com.j2htmx.inline.nodes.standard.text.Heading;

import java.util.List;


public class ButtonRepository {
    Table cart = new Table();
    public void addToCart(String name, String price) {
        Heading nme = new Heading("h5");
        nme.setContent("Item");
        Heading prc = new Heading("h5");
        prc.setContent("Price");
        cart.addData(List.of(nme.createPairNode().concat(prc.createPairNode())));
    }

    public String getCart() {
        return cart.createPairNode();
    }
}
