package com.j2htmx.inline.nodes.standard.table;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class TR extends NodeCreator {
	public TR() {
		setTag("tr");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}