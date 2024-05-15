package com.demo.HibeDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Demo3 {

	public void largeSmall()
	{
		int array[]= {3,1,4,5,9,8};
		int max=array[0];
		int min=array[0];
		
		for(int i=1;i<array.length;i++)
		{
			if(max<array[i])
			{
				max=array[i];
			}
		}
		
		System.out.println("Maximum element : "+max);
		
		for(int i=1;i<array.length;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
		}
		
		System.out.println("Minimum element : "+min);
	}
	 
	public void countChar() 
	{
		
		String inputString = "Hellotyuioh";
		
		char[] chararray = inputString.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<chararray.length;i++)
		{
			int count = 0;
			for(int j=0;j<chararray.length;j++)
			{
			
				if(chararray[i]==chararray[j])
				{
					count++;
				}
				else
				{
					continue;
				}
				map.put(chararray[i], count);
			}
		}
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
		    Character key = entry.getKey();
		    Integer value = entry.getValue();
		    System.out.println("Char "+key+" value "+value);
		}
	
	}
	
	public void mapcountchar()
	{
		String inputString = "Helloh";
		Map<Character, Integer> charCountMap = new HashMap<>();
		for (char c : inputString.toCharArray()) {
		if (Character.isWhitespace(c) || !Character.isLetterOrDigit(c)) {
		                continue;
		            }
		char lowercaseChar = Character.toLowerCase(c);
		charCountMap.put(lowercaseChar, charCountMap.getOrDefault(lowercaseChar, 0)+1);
		}
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " time(s)");
		        }
		
	}
	
	public void anagramString()
	{
		String str1 = "silent";
		String str2 = "listen";
//		String str1 = "elbow";
//		String str2 = "below";
//		String str1 = "arm";
//		String str2 = "gram";
		int count = 0;
		int checkcount = str1.length();
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				for(int j=0;j<str2.length();j++)
				{
					if(str1.charAt(i)==str2.charAt(j))
					{
						count++;
						break;
					}	
				}
			}
			if(count==checkcount)
			{
				System.out.println("String are anagrams");
			}
			else
			{
				System.out.println("String are not anagrams");
			}
		}
		else
		{
			System.out.println("String are not anagrams");
		}
	}
	
	public void checkWord()
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the operation (e.g., 1ADD3, 1SUB3, 1MUL3, 1DIV3): ");
        String input = scanner.nextLine();
        
        int fdcount=0;
        int charcount = 0;
        for(int i=0;i<input.length();i++)
        {
        	if((input.charAt(i)>='a'&&input.charAt(i)<='z')||(input.charAt(i)>='A'&&input.charAt(i)<='Z'))
        	{
        		fdcount = i;
        		break;
        	}
        }
        for(char c : input.toCharArray())
        {
        	if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
        	{
        		charcount ++;
        		
        	}
        }
       
        int firstdigit =Integer.parseInt( input.substring(0,fdcount));
        String pos = input.substring(fdcount,fdcount+charcount);
        int lastdigit = Integer.parseInt(input.substring(fdcount+charcount,input.length()));
       

        if(pos.contains("add") || pos.contains("ADD"))
        {
        	System.out.println("Addition of two numbers is : "+(firstdigit+lastdigit));
        }
        else if(pos.contains("sub")|| pos.contains("SUB"))
        {
        	System.out.println("Subtraction of two numbers is : "+(firstdigit-lastdigit));
        }
       
        else if(pos.contains("mul")|| pos.contains("MUL"))
        {
        	System.out.println("multiplication of two numbers is : "+(firstdigit*lastdigit));
        }
        else if(pos.contains("div")|| pos.contains("DIV"))
        {
        	System.out.println("division of two numbers is : "+(firstdigit/lastdigit));
        }
        else
        {
        	System.out.println("String does not contain suitable operation");
        }
//        System.out.println(firstdigit);
//        System.out.println(pos);
//        System.out.println(lastdigit);
        		
	}
	
	public void longestCommonPrefix()
	{
		String array[]= {"wl","flowers","flower","flowe","flow","flo","fl","fle"};
		String s1=null;
		for(int i=0;i<array.length;i++)
		{
			String s = array[i];
			for(int j=1;j<array.length;j++)
			{
				if(s.charAt(i)==array[j].charAt(i))
				{
					s1=s1+s.charAt(i);
				}
			}
			
		}
		
	}
	
	
	public void printSome()
	{
//		String s1 = "Hello";
//		String s2 = s1.concat(" World");
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		int x = 5;
//		x = x++;
//		System.out.println(x);
		String mfName="AltruistTechnologyr";
		String mfcode = mfName.equals("AltruistTechnology")?"01180":"Branch_code";
		System.out.println(mfcode);
	}
	
	public void listDemo()
	{
		List<String> list1 = new ArrayList<>();
	
		List<String> list2 = new ArrayList<>();
		
		for(int i=0;i<list1.size();i++)
		{
			String date1 = list1.get(i);
			
		}
	}
	public void bcrypt()
	{
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode("CJLW0850#123");
		System.out.println(hashedPassword);
	}
	
	public Date addDate()
	{
		LocalDate localDate = LocalDate.now();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date utilDate = null;
		try {
			utilDate = sdf.parse(localDate.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return utilDate;
	}
	
	public static Date convertLocalDateToUtilDate(LocalDate localDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date utilDate = sdf.parse(localDate.toString());
        return utilDate;
    }
	
	public static Date convertLocalDateToUtilDateAdd(LocalDate localDate) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date utilDate = sdf.parse(localDate.toString());
        return utilDate;
    }
	
	
	public static void main(String args[])
	{
		Demo3 demo3= new Demo3();
//		demo3.largeSmall();
		
		demo3.countChar();
//		demo3.printSome();
//		demo3.mapcountchar();
//		demo3.anagramString();
//		demo3.checkWord();
//		demo3.longestCommonPrefix();
		
//		demo3.bcrypt();
		
		
//		System.out.println("Lenth of the String : "+"$2a$10$smaaERlf93MfLCSqEBpbS.VIdxRx6vV7ssE0RG9KF7/PsydYqIBdK".length());
//		try {
//            LocalDate localDate = LocalDate.now(); // Your LocalDate
//            Date utilDate = convertLocalDateToUtilDate(localDate);
//            System.out.println("LocalDate: " + localDate);
//            System.out.println("java.util.Date: " + utilDate);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//		
//		
//		try {
//            LocalDate localDate = LocalDate.now().plusDays(92); // Your LocalDate
//            Date utilDate = convertLocalDateToUtilDateAdd(localDate);
//            System.out.println("LocalDate: " + localDate);
//            System.out.println("java.util.Date: " + utilDate);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
	}
}
