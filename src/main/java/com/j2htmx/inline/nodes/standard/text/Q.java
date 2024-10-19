package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Q extends NodeCreator {
	public Q() {
		setTag("q");
	}
	void setQContent(String content) {
		setContent(content);
	}

}
