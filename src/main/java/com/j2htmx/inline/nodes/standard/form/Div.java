package com.j2htmx.inline.nodes.standard.form;


import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Div  extends NodeCreator {
	public Div() {
		setTag("div");
	}
	void setLabelContent(String content) {
		setContent(content);
	}
}