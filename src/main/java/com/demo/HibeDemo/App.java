package com.demo.HibeDemo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.lang3.RandomStringUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import net.bytebuddy.utility.RandomString;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public void arrayListDemo()
	{
		List<List<Integer>> myArrayList = new ArrayList<>();
	       myArrayList.add(Arrays.asList(0, 5, 10, 16));
	       myArrayList.add(Arrays.asList(24, 29, 30, 35, 41, 45, 50));
	       myArrayList.add(Arrays.asList(0, 6, 41, 45, 58));

	        System.out.println(myArrayList.stream().map(l -> l.get(0)).collect(Collectors.toList()));	
	}
	
	public void checkbranchcode()
	{
		String sevendigit= "ALTRUI1234567";
		String fivedigit= "ALTRUI54321";
		
		System.out.println(sevendigit.substring(6, sevendigit.length()).trim());
		System.out.println(fivedigit.substring(6, fivedigit.length()).trim());
	}
	
	public void checkCreditLimit()
	{
		String branchlimit=null;
		String branchtype=null;
		
		System.out.println(branchlimit);
		System.out.println(branchtype);
		if (branchlimit==null)
		{
			System.out.println("branch limit null");
		}
		if(branchtype==null)
		{
			System.out.println("branch type null");
		}
		
		if((branchlimit == null) && (branchtype=="mftinpan" || branchtype=="directtinpan"))
		{
			System.out.println("Inside mftinpan or directtinpan");
		}
		else if((branchlimit == null) && (branchtype=="mftinfc" || branchtype=="mftinfc"))
		{
			System.out.println("Inside mftinfc or mftinfc");
		}
		else
		{
			System.out.println("All Null");
		}
		
	}
	
	
	public void alphaNumericRandom()
	{
		Random rn = new Random();
		int randomnumber = rn.nextInt(9 - 0 + 1) + 0;
		
       String randomstring=RandomStringUtils.random(4, true, false);
       
       String branchcode= randomstring+randomnumber;
       System.out.println("Random String :  "+branchcode.toLowerCase());
	}
	public void checkTime()
	{
		System.out.println(new Timestamp(System.currentTimeMillis() - TimeUnit.MINUTES.toMillis(30*96)));
	}
	
	public void checkContains()
	{
		String msg = "123456789012345";
		System.out.println(msg.matches(".*\\D.*"));
	}
	
	
	public void removeComma()
	{
		String name="hello.pdf,,";
		
		int lengthOfFile = name.trim().length();
		char charAtTheEnd = name.trim().charAt(lengthOfFile-1);
		if((charAtTheEnd>='a' && charAtTheEnd <='z') || (charAtTheEnd>='A' && charAtTheEnd <='Z'))
		{
			System.out.println("It does not ");
		}
		else
		{
        	System.out.println("it consist special in the end");
        	String newfile = name.substring(0, lengthOfFile-1);
        	System.out.println("Now check "+newfile);
        }
       
	}
	
	public String checkExceptionHandling()
	{
		try {
			System.out.println("Inside Exception try");
			RuntimeException e =new RuntimeException("Throwing custom Exception");
			throw e;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "catch";
		}
		finally {
			System.out.println("insde finally");
		}
	}
	
	public void callingException()
	{
		System.out.println("Calling Exception Handling method "+checkExceptionHandling());
	}
	
	public void checkAmount()
	{
		String first ="72";
		
		if(first.contains("72"))
		{
			System.out.println("Inside match case "+first+"  is matching ");
		}
	}
	
	public void sortArray()
	{
		int a[]= {70,50,20,90,100,10,30};
		int b[]=new int[a.length];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				
				System.out.println(min);
			}
		}	
		
	}
	
	public void factorial()
	{
		int number = 5;
		int factorial=1;

		for(int i=number;i>=1;i--)
		{
			factorial=i*factorial;
		}
		System.out.println(factorial);
	}
	
    public static void main( String[] args )
    {
    	
    	App app = new App();
//    	app.removeComma();
//    	app.callingException();
//    	app.sortArray();
    	app.factorial();
//    	app.checkAmount();
    	
    //	app.arrayListDemo();
    	
    	//app.checkbranchcode();
    	//app.checkCreditLimit();
//    	app.checkTime();
    	
//    	app.alphaNumericRandom();
    	
//    	app.checkContains();
//        Student s=new Student();
//        
//        s.setRollno(101);
//        s.setName("Hemant");
//        s.setEmailid("Hemant@gmail.com");
//        
//        SessionFactory sf=new Configuration().configure().buildSessionFactory(); 
//        
//        Session session=sf.openSession();
//        
//        Transaction transaction = session.beginTransaction();
//        
//        session.save(s);
//        
//        transaction.commit();
    }
}
