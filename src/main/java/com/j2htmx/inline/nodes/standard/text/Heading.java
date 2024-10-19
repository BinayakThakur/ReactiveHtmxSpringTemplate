package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Heading extends NodeCreator {
	public Heading(String headingVariant) {
		setTag(headingVariant);
	}
	public Heading() {
		setTag("h2");
	}
	void setHeadingContent(String content) {
		setContent(content);
	}
}
