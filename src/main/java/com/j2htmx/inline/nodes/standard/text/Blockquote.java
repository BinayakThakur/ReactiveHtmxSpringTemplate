package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Blockquote extends NodeCreator {
	public Blockquote() {
		setTag("blockquote");
	}
	void setBlockQuoteContent(String blockquote) {
		setContent(blockquote);
	}
}
