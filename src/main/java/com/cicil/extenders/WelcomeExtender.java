package com.cicil.extenders;

/*
 * please refer to https://stackoverflow.com/questions/6462343/java-extending-a-class-and-reusing-the-methods
 */

public class WelcomeExtender {
	public void printWelcome(String className) {
		System.out.println("#################################################");
		System.out.println("Greetings, from class:");
		System.out.println(className);
		System.out.println("#################################################");
	}
}
