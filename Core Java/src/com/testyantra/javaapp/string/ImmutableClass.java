package com.testyantra.javaapp.string;

final public class ImmutableClass {
	private final String name;
	private final String nickname;

	public ImmutableClass(String name, String nickname) {
		super();
		this.name = name;
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public String getNickname() {
		return nickname;
	}

}
