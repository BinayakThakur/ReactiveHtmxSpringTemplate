package com.j2htmx.inline.nodes.standard.list;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class ListItem extends NodeCreator {
	public ListItem() {
		setTag("li");
	}
	void setListItemContent(String content) {
		setContent(content);
	}
}
