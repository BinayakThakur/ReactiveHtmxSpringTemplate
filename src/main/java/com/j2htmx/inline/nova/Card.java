package com.j2htmx.inline.nova;

import com.j2htmx.inline.nodes.nodes.NodeCreator;
import com.j2htmx.inline.nodes.standard.form.Button;
import com.j2htmx.inline.nodes.standard.form.Div;
import com.j2htmx.inline.repository.ThemeRepository;
import org.springframework.util.StringUtils;

import java.util.UUID;


public class Card extends NodeCreator {
    ThemeRepository themeRepository = new ThemeRepository();
    public Card() {
        setTag("div");
        Div div = new Div();
        setClass(themeRepository.getTheme());
        div.setContent(header().createPairNode().concat(content().createPairNode()).concat(execute(UUID.randomUUID().toString()).createPairNode()).concat(execute(UUID.randomUUID().toString()).createPairNode()));
        setContent(div.createPairNode());
    }

    public void init(String header, String content, String buttonContent) {
        setTag("div");
        Div div = new Div();
        div.setStyle("wrapbox");
        Button button = new Button("Report", UUID.randomUUID().toString());
        button.setStyle("button-secondary");
        div.setContent(header(header).createPairNode().concat(content(content).createPairNode()).concat(execute(UUID.randomUUID().toString(), buttonContent).createPairNode().concat(button.createPairNode())));
        setContent(div.createPairNode());
    }

    private Div header() {
        Div div = new Div();
        div.setContent("Header");
        div.setStyle("interh4");
        return  div;
    }


    private Div content() {
        Div div = new Div();
        div.setContent("Content");
        div.setStyle("interh5");
        return  div;
    }

    private Button execute(String clientId) {
        Button button = new Button("Execute", clientId);
        button.setStyle("button");
        button.addStyle("button-hover");
        return button;
    }


    private Div header(String header) {
        Div div = new Div();
        div.setContent(header);
        div.setStyle("interh4");
        return  div;
    }


    private Div content(String content) {
        Div div = new Div();
        div.setContent(content);
        return  div;
    }

    private Button execute(String clientId, String buttonContent) {
        Button button = new Button(buttonContent, clientId);
        button.setStyle("button-dark");
        return button;
    }

}
