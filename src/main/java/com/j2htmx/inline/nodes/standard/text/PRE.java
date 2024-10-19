package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class PRE extends NodeCreator {
	public PRE() {
		setTag("pre");
	}
	void setPREContent(String content) {
		setContent(content);
	}
}
