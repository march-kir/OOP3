package com.gmail.kirillmarch6;

import java.io.File;

public class MainCheckCatalog {

	public void CurrentCheckCatalog(File[] fileList, File[] currentFileList) {
		System.out.println("����������� ��������� ��������:");
		CheckCatalog(fileList);
		System.out.println("������� ��������� ��������:");
		CheckCatalog(currentFileList);
		try {
			for (int i = 0; i < fileList.length; i++) {
				for (int j = 0; j < currentFileList.length; j++) {
					if (fileList[i].getName().equals(currentFileList[j].getName()) == false
							&& j == currentFileList.length - 1) {
						System.out.println("���� " + fileList[i].getName() + " ������ �� ��������");
					}
					if (fileList[i].getName().equals(currentFileList[j].getName())) {
						break;
					}
				}
			}
			for (int i = 0; i < currentFileList.length; i++) {
				for (int j = 0; j < fileList.length; j++) {
					if (currentFileList[i].getName().equals(fileList[j].getName()) == false
							&& j == fileList.length - 1) {
						System.out.println("���� " + currentFileList[i].getName() + " �������� � �������");
					}
					if (currentFileList[i].getName().equals(fileList[j].getName())) {
						break;
					}
				}
			}
		} catch (NullPointerException e) {
			System.out.println("������ ���");
		}
	}

	public void CheckCatalog(File[] fileList) {
		try {
			for (File file : fileList) {
				if (file == null) {
					continue;
				} else {
					System.out.println(file.getName());
				}
			}
		} catch (NullPointerException e) {
			System.out.println("������ ���");
		}
	}
	
}
