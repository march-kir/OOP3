package com.gmail.kirillmarch6;

public class Main {

	public static void main(String[] args) {
			
		for (int i = 0; i < 99; i++) {
			GetFactorial task = new GetFactorial(i);
			Thread thread = new Thread(task);
			thread.start();
		}

	}

}
