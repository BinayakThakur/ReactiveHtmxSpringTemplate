package com.j2htmx.inline.nodes.standard.text;

import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class BDO extends NodeCreator {
	public BDO() {
		setTag("bdo");
	}
	void setBDOContent(String content) {
		setContent(content);
	}
}
