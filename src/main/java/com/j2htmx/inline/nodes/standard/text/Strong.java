package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Strong extends NodeCreator {
	public Strong() {
		setTag("strong");
	}
	void setStrongContent(String content) {
		setContent(content);
	}
}
