package com.gmail.kirillmarch6;

public class SortShell implements Runnable {

	int[] arr;
	int startIndex;
	int increment;

	public SortShell(int[] arr, int startIndex, int increment) {
		super();
		this.arr = arr;
		this.startIndex = startIndex;
		this.increment = increment;
	}

	public SortShell() {
		super();
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getIncrement() {
		return increment;
	}

	public void setIncrement(int increment) {
		this.increment = increment;
	}

	private void insertionSort(int[] arr, int startIndex, int increment) {
		for (int i = startIndex; i < arr.length - 1; i = i + increment) {
			for (int j = Math.min(i + increment, arr.length - 1); j - increment >= 0; j = j - increment) {
				if (arr[j - increment] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j - increment];
					arr[j - increment] = tmp;
				} else {
					break;
				}
			}
		}
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		if (thr.isInterrupted()) {
			System.out.println(thr.getName() + " Interrupted");
			return;
		}
		insertionSort(arr, startIndex, increment);
	}

}
