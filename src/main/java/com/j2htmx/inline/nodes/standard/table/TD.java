package com.j2htmx.inline.nodes.standard.table;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class TD extends NodeCreator {
	public TD() {
		setTag("td");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}