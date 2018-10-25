package com.gmail.kirillmarch6;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		MainCheckCatalog check = new MainCheckCatalog();
		File in = new File("CurrentFolder");
		File[] fileList = in.listFiles();
		File[] currentFileList = null;

		System.out.println("Первичное состояние каталога:");
		check.CheckCatalog(fileList);

		WorkProgramm wp = new WorkProgramm(check, fileList, currentFileList);
		Thread thread = new Thread(wp);
		thread.start();
	}

}
