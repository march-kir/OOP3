package com.gmail.kirillmarch6;

import java.io.File;

public class MainCheckCatalog {

	public void CurrentCheckCatalog(File[] fileList, File[] currentFileList) {
		System.out.println("Сохраненное состояние каталога:");
		CheckCatalog(fileList);
		System.out.println("Текущее состояние каталога:");
		CheckCatalog(currentFileList);
		try {
			for (int i = 0; i < fileList.length; i++) {
				for (int j = 0; j < currentFileList.length; j++) {
					if (fileList[i].getName().equals(currentFileList[j].getName()) == false
							&& j == currentFileList.length - 1) {
						System.out.println("Файл " + fileList[i].getName() + " удален из каталога");
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
						System.out.println("Файл " + currentFileList[i].getName() + " добавлен в каталог");
					}
					if (currentFileList[i].getName().equals(fileList[j].getName())) {
						break;
					}
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Файлов нет");
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
			System.out.println("Файлов нет");
		}
	}
	
}
