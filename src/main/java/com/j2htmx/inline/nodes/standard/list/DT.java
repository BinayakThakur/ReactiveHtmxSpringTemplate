package com.j2htmx.inline.nodes.standard.list;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class DT  extends NodeCreator {
	public DT() {
		setTag("dt");
	}
	void setDTContent(String content) {
		setContent(content);
	}
}
