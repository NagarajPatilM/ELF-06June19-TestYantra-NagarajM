package com.testyantra.javaapp.assignmentthree;

import lombok.extern.java.Log;

@Log
public class LoadingGun {
	int bullets;

	public void setBullets(int bullets) {
		this.bullets = bullets;
	}

	public static void main(String[] args) {
		LoadingGun l = new LoadingGun();
		l.setBullets(100);
		log.info("initial bullets = " + l.bullets);

	}

}