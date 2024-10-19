package com.j2htmx.inline.nodes.standard.form;


import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Legend extends NodeCreator {
	public Legend() {
		setTag("label");
	}
	void setLabelContent(String content) {
		setContent(content);
	}
}
