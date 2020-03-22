package com.nttdata.nilofer.javaioassgn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortFileAndCount {

//bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb

	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;

		// Create an ArrayList object to hold the lines of input file
		ArrayList<String> linesOfInputFile = new ArrayList<String>();

		try {
			// Creating BufferedReader object to read the input file
			reader = new BufferedReader(new FileReader("res/input.txt"));

			// Reading all the lines of input file one by one and adding them into ArrayList
			String currentLine = reader.readLine();

			while (currentLine != null) {
				linesOfInputFile.add(currentLine);

				currentLine = reader.readLine();
			}

			// Sorting the ArrayList

			Collections.sort(linesOfInputFile);

			// Creating BufferedWriter object to write into output file

			writer = new BufferedWriter(new FileWriter("res/output.txt"));

			// Writing sorted lines into output file
			int wc = 0;

			for (String line : linesOfInputFile) {
				// System.out.println(linesOfInputFile.get(i++));
				wc = wc + getWordCount(line);
				writer.write(line);

				writer.newLine();
			}
			writer.close();

			System.out.println("No. of Lines in the file is " + linesOfInputFile.size());
			System.out.println("No. of words in the file is " + wc);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static int getWordCount(String line) {
		  char ch[]= new char[line.length()];     
          int count=0;
		for(int i=0;i<line.length();i++)  
          {  
              ch[i]= line.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count++;  
          }  
          return count;  
	}
}
