package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class KBD extends NodeCreator {
	public KBD() {
		setTag("ins");
	}
	void setKBDContent(String content) {
		setContent(content);
	}
}
