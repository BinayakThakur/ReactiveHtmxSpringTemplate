package com.j2htmx.inline.nodes.standard.table;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class TH extends NodeCreator {
	public TH() {
		setTag("th");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}