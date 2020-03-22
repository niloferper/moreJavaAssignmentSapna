package com.nttdata.nilofer.exceptionhandling;

public class CharacterCount {

	public static int chkEmail(String userName, char findChar) {

		 int count =0;
		for (int i=0;i<userName.length();i++)
		{
			if (userName.charAt(i)==findChar)count+=1;
		}
		return count;
	}
}
