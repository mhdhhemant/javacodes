package com.demo.HibeDemo;

public class Demo2 {

	public void secondLarget()
	{
		int array[]= {10,20,45,56,78,90,90};
		int temp;
		int max=array[array.length-1];
		int secondlargest = 0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		for(int i=array.length-1;i>0;i--)
		{
			if(max>array[i])
			{
				secondlargest = array[i];
				break;
			}
		}
//			
		
		System.out.println("second larget number in the list : "+secondlargest);
	}
	
	
	
	
	public void nonRepeatedVowel()
	{
		String s="hheellooa";
		char array[]=s.toCharArray();
		char array2[]=new char[256];
		for(int i=0;i<array.length;i++)
		{	
			if(array[i] =='a'||array[i] =='e'||array[i] =='i'||array[i] =='o'||array[i] =='u')
			{	
				 for(; i < s.length(); i++){
			            array2[s.charAt(i)]++; 
			        }
			}		
		}
		
		
		System.out.println ("Non Repeating characters are");
        for (int i = 0; i < 256; i++)
        {
            if (array2[i] == 1)
            {
                System.out.println((char)i);
            }
        }
	}
	
	public static void main(String args[])
	{
		Demo2 demo = new Demo2();
//		demo.secondLarget();
		demo.nonRepeatedVowel();
	}
}
