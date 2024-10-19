package com.j2htmx.inline.nodes.standard.form;


import com.j2htmx.inline.nodes.nodes.NodeCreatorForm;

public class RadioButton extends NodeCreatorForm {
	public RadioButton(String content,String groupID) {
		setTag("input");
		setType("radio");
		setName(groupID);
		Label label=new Label();
		label.setContent(content);
		setContent(getContent()+label.createPairNode());
	}
	
}
