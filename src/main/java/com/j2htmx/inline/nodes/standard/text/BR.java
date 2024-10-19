package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class BR  extends NodeCreator {
	public BR() {
		setTag("br");
	}
	void setINSContent(String content) {
		setContent(content);
	}
}