package com.demo.HibeDemo;

import java.util.HashSet;
import java.util.Set;

public class Snippet {

	
	public static void main(String args[])
	{
		Boolean isAnagrams = isAnagrams("Listen","Silent");
		System.out.println("String is anagram :"+isAnagrams);
	}

	private static Boolean isAnagrams(String string1, String string2) {
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		Boolean status=false;
		char[] stringa = string1.toCharArray();
		int lengthofstring1 = string1.length();
		int lenghtofstring2= string2.length();
		String letter=null;
		int count=0;
		Set<String> set = new HashSet<>();
		if(lengthofstring1 == lenghtofstring2)
		{
			for(int i=0;i<lengthofstring1;i++)
			{
				letter = String.valueOf(stringa[i]);
				
				if(string2.contains(letter))
				{
					set.add(letter);
				}
			}
			
			if(count==lengthofstring1)
			{
				status=true;
			}
			else
			{
				status=false;
			}
		}
		else
		{
			status=false;
		}
		
		return status;
	}
}


