package com.gmail.kirillmarch6;

public class SumElementsOfArray implements Runnable {
	
	private int[] array;
	private int summaAllArray;

	public SumElementsOfArray(int[] array) {
		super();
		this.array = array;
	}

	public SumElementsOfArray() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	
	public int getSummaAllArray() {
		return summaAllArray;
	}

	public void setSummaAllArray(int summaAllArray) {
		this.summaAllArray = summaAllArray;
	}	
	
	public int getSummArray(int[] array) {
		int summa = 0;
		for (int i = 0; i < array.length; i++) {
			summa += array[i];
		}		
		return summa;
	}
	
	
	@Override
	public void run() {

		Thread thr = Thread.currentThread();
		if (thr.isInterrupted()) {
			System.out.println(thr.getName() + " Interrupted");
			return;
		}
		
		summaAllArray  = getSummArray(this.array);
	}


	

}
