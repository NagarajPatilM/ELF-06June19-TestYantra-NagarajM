package com.testyantra.javaapp.overriding;

import lombok.extern.java.Log;

class Animal {
	void eat() {

	}

}

class Cow extends Animal {
	void eat() {

	}
}
@Log
class Lion extends Animal {
	void eat() {
		log.info("hjk");
	}
}

class Test1 {
	static Animal a;

	public static void main(String[] args) {
		a = new Lion();
		a.eat();
	}
}
