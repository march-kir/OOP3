package com.gmail.kirillmarch6;

public class Main {

	public static void main(String[] args) {

		long startTime = System.nanoTime();
		int[] arr = new int[] { 5, 2, 3, 4, 1, 8, 2, 7, 5, 12, 7, 55, 4, 9, 21, 3, 77, 6, 1, 23, 7 };
		firstProgramm(arr);
		long timeSpent = System.nanoTime() - startTime;
		System.out.println("программа с потоками выполнялась " + timeSpent + " наносекукнд");

		startTime = System.nanoTime();
		secondProgramm(arr);
		timeSpent = System.nanoTime() - startTime;
		System.out.println("программа без потоков выполнялась " + timeSpent + " наносекукнд");

	}

	public static void firstProgramm(int[] arr) {
		int lenghtArray = arr.length % 2;
		int firstLenghtArray = arr.length / 2;
		int secondLenghtArray;
		if (lenghtArray == 0) {
			secondLenghtArray = arr.length / 2;
		} else {
			secondLenghtArray = arr.length / 2 + 1;
		}
		int[] arrOne = new int[firstLenghtArray];
		int[] arrTwo = new int[secondLenghtArray];
		for (int i = 0; i < firstLenghtArray; i++) {
			arrOne[i] = arr[i];
		}
		for (int i = 0; i < secondLenghtArray; i++) {
			arrTwo[i] = arr[i + firstLenghtArray];
		}
		SumElementsOfArray taskOne = new SumElementsOfArray(arrOne);
		SumElementsOfArray taskTwo = new SumElementsOfArray(arrTwo);
		Thread threadOne = new Thread(taskOne);
		Thread threadTwo = new Thread(taskTwo);
		threadOne.start();
		threadTwo.start();
		try {
			threadOne.join();
			threadTwo.join();
			System.out.println(taskOne.getSummaAllArray() + taskTwo.getSummaAllArray());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void secondProgramm(int[] arr) {
		SumElementsOfArrayWithoutThread withoutThread = new SumElementsOfArrayWithoutThread();
		int summa = withoutThread.getSummArray(arr);
		System.out.println(summa);
	}
}
