package com.j2htmx.inline.nodes.standard.form;


import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Label  extends NodeCreator {
	public Label() {
		setTag("label");
	}
	void setLabelContent(String content) {
		setContent(content);
	}
}
