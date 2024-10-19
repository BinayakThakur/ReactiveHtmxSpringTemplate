package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Del  extends NodeCreator {
	public Del() {
		setTag("del");
	}
	void setDelContent(String content) {
		setContent(content);
	}
}
