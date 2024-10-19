package com.j2htmx.inline.nodes.standard.link;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Image extends NodeCreator {
	public Image() {
		setTag("img");
	}
	public void setImage(String link) {
		setNodeLink(link);
	}
}
