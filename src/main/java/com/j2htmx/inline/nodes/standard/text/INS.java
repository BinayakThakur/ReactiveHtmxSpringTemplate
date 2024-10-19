package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class INS extends NodeCreator {
	public INS() {
		setTag("ins");
	}
	void setINSContent(String content) {
		setContent(content);
	}
}
