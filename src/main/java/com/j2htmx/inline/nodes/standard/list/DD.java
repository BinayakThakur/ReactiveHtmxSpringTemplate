package com.j2htmx.inline.nodes.standard.list;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class DD extends NodeCreator {
	public DD() {
		setTag("dd");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}
