package com.nttdata.nilofer.javaioassgn;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWordInFile {

	public static void main(String[] args) throws FileNotFoundException {

		String longestWord = findLongestWords();
		System.out.println("Longest Word in the file test.txt is :\n" + longestWord + "\n");
	}

	
//	 find the longest word in the file which is present in res folder 
	public static String findLongestWords() throws FileNotFoundException {

		String longestWord = "";
		String current;
		try {
		File myFile = new File("res/test.txt");
		//	File myFile = new File("test.txt");
		// System.out.println(myFile.getAbsolutePath());
		Scanner input = new Scanner(myFile);
		while (input.hasNext()) {
			current = input.next();
			if (current.length() > longestWord.length()) {
				longestWord = current;
			}
		}
		input.close();
		}catch (Exception e) {
			e.printStackTrace();
			longestWord = " File not found";
		}
		return longestWord;
	}

}
