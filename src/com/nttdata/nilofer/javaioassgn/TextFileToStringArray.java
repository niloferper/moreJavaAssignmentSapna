package com.nttdata.nilofer.javaioassgn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class TextFileToStringArray {

	public static void main(String[] args) {

		
		try {
			BufferedReader bufReader = new BufferedReader(new FileReader("res/test.txt"));
			ArrayList<String> arrayOfLines = new ArrayList<>();
			String line = bufReader.readLine();
			while (line != null) {
				arrayOfLines.add(line);
				line = bufReader.readLine();
			}
			for (int i = 0; i < arrayOfLines.size(); i++) {
				System.out.println("Line " + i + " from File : "+arrayOfLines.get(i));
			}
			bufReader.close();
		} catch (Exception e) {
			System.out.println("File not found");
		}

	}

}
