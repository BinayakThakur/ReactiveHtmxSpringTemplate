package com.j2htmx.inline.nova;

import com.j2htmx.inline.nodes.nodes.NodeCreator;
import com.j2htmx.inline.nodes.standard.form.InputBox;
import com.j2htmx.inline.nodes.standard.table.Table;

import java.util.List;

public class Home extends NodeCreator {
    public Home() {
        setTag("div");
        Navbar navbar = new Navbar();
        Table table = new Table();
        Card item1 = new Card();
        InputBox inputBox = new InputBox();
        inputBox.setStyle("input-field");
        inputBox.setPlaceholder("Search");

        item1.init("Advance Mathematics", "R.D Sharma", "Add to cart");

        Card item2 = new Card();
        item2.init("Organic Chemistry", "O.P Verma", "Add to cart");

        Card item3 = new Card();
        item3.init("Thermodynamics", "D Chevikovh", "Add to cart");

        Card item4 = new Card();
        item4.init("Structure 2", "BN Bansal", "Add to cart");

        Table bill = new Table();
        bill.addHeading(List.of("Items ", "Price"));
        bill.addData(List.of("Book1", "45 rs"));
        bill.addData(List.of("Book2", "95 rs"));
        bill.addData(List.of("Book3", "12 rs"));
        bill.addData(List.of("Book4", "39 rs"));


        table.addData(List.of(item1.createPairNode(),item2.createPairNode(),item3.createPairNode()));
        table.addData(List.of(item4.createPairNode(),item4.createPairNode(),item4.createPairNode()));
        setContent(navbar.createPairNode().concat(inputBox.createPairNode()).concat(table.createPairNode()).concat(bill.createPairNode()));
    }
}
