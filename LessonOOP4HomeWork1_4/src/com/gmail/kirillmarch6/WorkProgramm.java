package com.gmail.kirillmarch6;

import java.io.File;

public class WorkProgramm implements Runnable {

	MainCheckCatalog check = new MainCheckCatalog();
	File[] fileList;
	File[] currentFileList;

	public WorkProgramm(MainCheckCatalog check, File[] fileList, File[] currentFileList) {
		super();
		this.check = check;
		this.fileList = fileList;
		this.currentFileList = currentFileList;
	}

	public WorkProgramm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MainCheckCatalog getCheck() {
		return check;
	}

	public void setCheck(MainCheckCatalog check) {
		this.check = check;
	}

	public File[] getFileList() {
		return fileList;
	}

	public void setFileList(File[] fileList) {
		this.fileList = fileList;
	}

	public File[] getCurrentFileList() {
		return currentFileList;
	}

	public void setCurrentFileList(File[] currentFileList) {
		this.currentFileList = currentFileList;
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		File in = new File("CurrentFolder");
		File[] fileList = in.listFiles();
		File[] currentFileList = in.listFiles();

		for (int i = 0; i < 10; i++) {
			try {
				fileList = currentFileList;
				currentFileList = in.listFiles();
				check.CurrentCheckCatalog(fileList, currentFileList);
				thr.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
