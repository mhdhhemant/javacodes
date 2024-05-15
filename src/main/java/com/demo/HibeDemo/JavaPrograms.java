package com.demo.HibeDemo;

import java.util.Scanner;

public class JavaPrograms {

	Scanner in =new Scanner(System.in);
	public int countNumberOfDigits()
	{
		System.out.println("Etner any number");
		int number = in.nextInt();
		int r = 0,q;
		for(int i=number;i>0;)
		{
			if(i%10!=0)
			{
				r++;
			}
			i = i/10;
		}
		return r;
	}
	
	public void firstAndLastDigit()
	{
		System.out.println("Etner any number");
		int number = in.nextInt();
		
		System.out.println("Last Digit : "+number%10);
		int r=0,i=0;
		
		for(i=number;i>0;)
		{
			r=i%10;
			i = i/10;
		}
		System.out.println("Fisrt Digit : "+r);
	}
	
//	enter any number and calculate sum of its digits.
	public void sumOfDigits()
	{
		System.out.println("Etner any number");
		int number = in.nextInt();
		int i=0, total=0,r=0;
		for(i=number;i>0;)
		{
			r=i%10;
			total=total+r;
			i=i/10;
		}
		System.out.println("Sum of digits : "+total);
	}
	
//	enter any number and print its reverse.
	public void swapFirstLast()
	{
		System.out.println("Etner any number");
		int number = in.nextInt();
		int i=0;
		
	}
	
	public int binarySearch(int array[], int valuetosearch)
	{
		int searchedIndex=-1;
		int l=0;
		int r=array.length-1;
		while(l<=r)
		{
			int m = l+(r-l)/2;
			if(array[m]==valuetosearch)
			{
				searchedIndex = m;
				return searchedIndex;
			}
			
			if(array[m]<valuetosearch)
			{
				l=m+1;
			}
			else
			{
				r=m-1;
			}
		}
		return searchedIndex;
	}
	
	public int linearSearch(int array[], int valuetosearch)
	{
		int indexofvalue=-1;
		boolean flag=false;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==valuetosearch)
			{
				indexofvalue=i;
				flag=true;
				break;
			}
		}
		
		if(flag)
		{
			return indexofvalue;
		}
		else
		{
			return indexofvalue;
		}
	}
	
	public void sumOfArrayElements()
	{
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		int total=0;
		for(int i=0;i<array.length;i++)
		{
			total=total+array[i];
		}
		System.out.println("Sum of all array elements : "+total);
	}
	
	public void minMaxofArray()
	{
		int array[]= {45,32,12,45,90,98,34,2,67,89,112,544,23,45,56,77};
		
		int min=array[0];
		int max=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		
		System.out.println("Minimum : "+min);
		System.out.println("Maximum : "+max);
	}
	
	public void secondLargest()
	{
		int array[]= {45,32,12,45,90,98,34,2,67,89,112,544,23,45,56,77};
		int secondmax=array[0];
		int max=0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					max=array[i];
					array[i]=array[j];
					array[j]=max;
				}
			}
		}
		
		System.out.println("Second largest element of the array : "+array[array.length-2]);
		
	}
	
	public void copyArray()
	{
		int array[]= {45,32,12,45,90,98,34,2,67,89,112,544,23,45,56,77};
		int array1[]=new int [array.length];
		
		for(int i=0;i<array.length;i++)
		{
			array1[i]=array[i];
		}
		
		for(int i:array1)
		{
			System.out.println("array elements "+i);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaPrograms jp = new JavaPrograms();
//		int number = jp.countNumberOfDigits();
//		System.out.println("Number of digits : "+number);
//		jp.firstAndLastDigit();
//		jp.sumOfDigits();
		
		int array[]= {2,5,9,10,15,17,18,23,26,29,32,35,36,39,41,46,49,50};
		int valuetosearch=35;
//		int result=jp.binarySearch(array,valuetosearch);
//		int result = jp.linearSearch(array, valuetosearch);
//		
//		if(result==-1)
//		{
//			System.out.println("Value not present ");
//		}
//		else
//		{
//			System.out.println("Value presented at index "+result +" and "+array[result]);
//		}
//
		
//		jp.sumOfArrayElements();
//		jp.minMaxofArray();
//		jp.secondLargest();
		jp.copyArray();
		
	}

}


