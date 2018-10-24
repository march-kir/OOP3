package com.gmail.kirillmarch6;

import java.math.BigInteger;

public class GetFactorial implements Runnable {

	private int n;

	public GetFactorial(int n) {
		super();
		this.n = n;
	}

	public GetFactorial() {
		super();
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public BigInteger factorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i < n; i++) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		if (thr.isInterrupted()) {
			System.out.println(thr.getName() + " Interrupted");
			return;
		}
		System.out.println(thr.getName() + " ==> " + this.n + " != " + factorial(this.n));
	}
}
