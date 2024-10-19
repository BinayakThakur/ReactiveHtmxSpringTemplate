package com.j2htmx.inline.nodes.standard.form;

import com.j2htmx.inline.nodes.nodes.NodeCreatorForm;

public class SubmitButton extends NodeCreatorForm {
	public SubmitButton() {
		setTag("input");
		setType("submit");
	}
	public void setButtonContent(String content) {
		setButtonContent(content);
	}

}
