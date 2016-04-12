package com.chenli.struts2;

public class HelloWorldAction {
	private String name;

	public String execute() throws Exception {
		setName(name + "....");
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}