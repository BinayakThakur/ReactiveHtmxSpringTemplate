package com.j2htmx.inline.nodes.nodes;

import com.j2htmx.inline.nodes.custom.processor.CSSLoader;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class NodeCreator extends CSSLoader {
	String Tag="";
	String classStyle = "";
	String content="";
	String layout="";
	String styleID="";
	String style="";
	String href="";
	Object clientId = "";
	String hxPost = "";
	String hxTarget = "";
	String width = "";
	String height = "";
	String id = "";
	List<String> addedStyles = new ArrayList<>();

	@Override
	public int hashCode() {
		return clientId.hashCode();
	}

	public void setClientId(Object obj) {
		this.clientId = obj;
	}

	public void setHxPost(String url) {
		this.hxPost = " hx-get = "+url;
	}

	public void setHxTarget(String target) {
		this.hxTarget = " hx-target = "+target;
	}

	public Object getClientId() {
		return this.clientId;
	}

	public String createPairNode(){
		if(Tag.equals("img")) {
			return "<"+this.Tag+style+" "+"src ="+href+"/>";
		}
		if(href.length()>0) {
			return "<"+this.Tag+style+" "+"href ="+href+">"+ this.content   + "</"+this.Tag+">";
		}
		return "<"+this.Tag+classStyle+style+id+width+height+hxPost+hxTarget+" >"+ this.content   + "</"+this.Tag+">";
	}
	public void setTag(String tag) {
			this.Tag=tag;
	}

	public void setContent(NodeCreator... nodeCreators){
		String node = "";
		for (NodeCreator nodeCreator : nodeCreators) {
			node.concat(nodeCreator.createPairNode());
		}
		this.content = node;
	}

	public void addContent(NodeCreator... nodeCreators){
		String node = "";
		for (NodeCreator nodeCreator : nodeCreators) {
			node.concat(nodeCreator.createPairNode());
		}
		this.content = this.content.concat(node);
	}

	public void setContent(String content) {
		this.content=content;
	}

	public void addContent(String content) {
		this.content.concat(content);
	}

	public void setNodeLink(String href) {
		this.href=href;
	}
	public String getContent() {
		return content;
	}
	public void setStyle(String styleClass) {
		this.style=" style=' "+getProperty(styleClass)+"' ";
		addedStyles.add(getProperty(styleClass));
	}

	public void setClass(String styleClass) {
		this.classStyle=" class=' "+styleClass+"' ";
	}

	public void addStyle(String styleClass) {
		addedStyles.add(getProperty(styleClass));
		String styleAdded = addedStyles.stream().reduce("", (a,b)->a+" "+b);
		this.style=" style=' "+styleAdded+"' ";
	}
	public void setWidth(String width) {
		this.width=" width = ".concat(width);
	}
	public void setHeight(String height) {
		this.height=" width = ".concat(height);
	}
	public void setId(String id) {
		this.id = " id='"+id+"'";
	}
	
}
