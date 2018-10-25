package com.gmail.kirillmarch6;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[] {7,3,9,10,5,1,13,8,22,1};
		int increment = arr.length / 2;
		
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
            	SortShell sh = new SortShell(arr, startIndex, increment);
            	Thread thread = new Thread(sh);
            	thread.start();
            	try {
                	thread.join();
        			System.out.println(Arrays.toString(arr));
        		} catch (InterruptedException e) {
        			e.printStackTrace();
        		}
            }
            increment = increment / 2;
        }
        

	}

}
