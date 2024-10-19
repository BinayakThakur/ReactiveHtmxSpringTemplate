package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Cite extends NodeCreator {
	public Cite() {
		setTag("cite");
	}
	void setCiteText(String content) {
		setContent(content);
	}
}
