package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class SAMP extends NodeCreator {
	public SAMP() {
		setTag("samp");
	}
	void setSAMPContent(String content) {
		setContent(content);
	}
}
