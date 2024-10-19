package com.j2htmx.inline.nodes.standard.form;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Form extends NodeCreator {
	public Form() {
		setTag("form");
	}
	void setLabelContent(String content) {
		setContent(content);
	}
}