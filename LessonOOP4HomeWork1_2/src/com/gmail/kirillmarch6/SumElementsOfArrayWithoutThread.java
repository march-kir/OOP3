package com.gmail.kirillmarch6;

public class SumElementsOfArrayWithoutThread {

	private int summaAllArray;

	public SumElementsOfArrayWithoutThread(int summaAllArray) {
		super();
		this.summaAllArray = summaAllArray;
	}

	public SumElementsOfArrayWithoutThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSummaAllArray() {
		return summaAllArray;
	}

	public void setSummaAllArray(int summaAllArray) {
		this.summaAllArray = summaAllArray;
	}
	
	public int getSummArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			summaAllArray += array[i];
		}		
		return summaAllArray;
	}
}
