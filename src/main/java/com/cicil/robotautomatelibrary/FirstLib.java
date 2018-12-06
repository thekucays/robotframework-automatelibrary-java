package com.cicil.robotautomatelibrary;

import java.util.ArrayList;

public class FirstLib {
	public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	public void TestCall(){
		System.out.println("hy");
	}

	/*
		String testings
	*/
	public String SayGreetings(){
		return "hi, i am alive";
	}

	public String SayGreetingsWithName(String name){
		return "hi, " + name + " i am fucking alive";
	} 

	public String[] SayGreetingWithArray(String name){
		String test = "static string";
		String[] result = new String[2];
		result[0] = test;
		result[1] = name;

		return result;
	}


	/*
		int testings
	*/
	public int TestIntNumber(){
		return 1;
	}

	public int Addition(int param){
		int staticInt = 1;
		return 1 + param;
	}

	public int[] ReturnIntArray(int param){
		int staticInt = 1;
		int process = param + staticInt;

		int returnValue[] = new int[2];
		returnValue[0] = staticInt;
		returnValue[1] = process;

		return returnValue;
	}
	

	/*
		ArrayList testings
	*/
	public ArrayList<String> ReturnStringArrayList(){
		ArrayList<String> result = new ArrayList<String>();
		result.add("hello");
		result.add("i am fucking alive");
		
		return result;
	}
}
