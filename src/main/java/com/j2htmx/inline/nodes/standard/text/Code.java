package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Code extends NodeCreator {
	public Code() {
		setTag("code");
	}
	void setCodeContent(String content) {
		setContent(content);
	}

}
