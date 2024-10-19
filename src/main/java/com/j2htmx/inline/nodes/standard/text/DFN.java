package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class DFN extends NodeCreator {
	public DFN() {
		setTag("dfn");
	}
	void setDFNContent(String content) {
		setContent(content);
	}
}
