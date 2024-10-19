package com.j2htmx.inline.nodes.standard.form;


import com.j2htmx.inline.nodes.nodes.NodeCreator;

public class Button extends NodeCreator {
	public Button(String content, String clientId) {
		setContent(content);
		setClientId(clientId);
		setTag("button");
	}
	public Button(String content, String clientId, String hxPost, String hxTarget) {
		setContent(content);
		setClientId(clientId);
		setHxPost(hxPost);
		setHxTarget(hxTarget);
		setTag("button");
	}
}
