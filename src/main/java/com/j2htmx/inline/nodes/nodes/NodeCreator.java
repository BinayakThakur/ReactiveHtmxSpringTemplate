package com.j2htmx.inline.nodes.nodes;

import com.j2htmx.inline.nodes.custom.processor.CSSLoader;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NodeCreator extends CSSLoader {
	String Tag="";
	String content="";
	String layout="";
	String styleID="";
	String style="";
	String href="";
	Object clientId;
	String hxPost;
	String hxTarget;

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
		return "<"+this.Tag+style+hxPost+hxTarget+" >"+ this.content   + "</"+this.Tag+">";
	}
	public void setTag(String tag) {
			this.Tag=tag;
	}
	public Boolean setContent(String content) {
		this.content=content;
		return true;
	}
	public void setNodeLink(String href) {
		this.href=href;
	}
	public String getContent() {
		return content;
	}
	public void setStyle(String styleClass) {
		this.style=" style='"+getProperty(styleClass)+"' ";
	}
	
}
