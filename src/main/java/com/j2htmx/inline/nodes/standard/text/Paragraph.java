package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Paragraph extends NodeCreator {
	public Paragraph() {
		setTag("p");
	}
	void setParagraphContent(String content) {
		setContent(content);
	}
}
