package com.j2htmx.inline.nova;

import com.j2htmx.inline.nodes.nodes.NodeCreator;
import com.j2htmx.inline.nodes.standard.form.Button;
import com.j2htmx.inline.nodes.standard.form.Div;
import com.j2htmx.inline.nodes.standard.table.Table;
import com.j2htmx.inline.nodes.standard.text.Heading;

import java.util.List;
import java.util.UUID;

public class Home extends NodeCreator {
    public Home() {
        setTag("div");
        setClass("theme-win98");
        Table table = new Table();
        Heading heading = new Heading("h2");
        heading.setContent("LOREM IPSUM");
        table.addData(List.of(heading.createPairNode()));
        Table dashboard = new Table();
        dashboard.addData(List.of(dashboard()));
        setContent(table.createPairNode().concat(getGrocery()).concat(dashboard.createPairNode()));
    }

    private String getGrocery() {
        Button dairy = new Button("Dairy and Eggs", UUID.randomUUID().toString());
        dairy.setHxPost("/dairy");
        dairy.setHxTarget("#dashboard-div");
        Button vegetables = new Button("Vegetables", UUID.randomUUID().toString());
        vegetables.setHxPost("/vegetable");
        vegetables.setHxTarget("#dashboard-div");
        Button snacks = new Button("Snacks", UUID.randomUUID().toString());
        snacks.setHxPost("/snack");
        snacks.setHxTarget("#dashboard-div");
        Table table = new Table();
        table.addData(List.of(dairy.createPairNode(),vegetables.createPairNode(), snacks.createPairNode()));
        return table.createPairNode();
    }

    private String dashboard() {
        Div div = new Div();
        div.setId("dashboard-div");
        return div.createPairNode();
    }


}
