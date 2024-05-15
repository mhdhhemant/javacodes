package com.demo.HibeDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public void method1()
	{
		Employee[] employees = {	
		new Employee(1,"Jeff",10000.0f),
		new Employee(2,"bill",20000.0f),
		new Employee(3,"mark",15000.0f)
		};
		
//		for(Employee e:employees)
//		{
//			System.out.println("Salary of "+e.getName()+ " is "+e.getSalary());
//		}
		
		Set<Float> list = Stream.of(employees).map(e -> e.getSalary()*2).collect(Collectors.toSet());
		
		System.out.println(list);
		List<Employee> empList = Arrays.asList(employees);
		
//		empList.stream().map(e -> e.getSalary()*2).collect(Collectors.toMap);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		StreamMethods sm = new StreamMethods();
		sm.method1();
	}
	
	
}
