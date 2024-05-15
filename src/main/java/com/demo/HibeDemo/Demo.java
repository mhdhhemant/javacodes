package com.demo.HibeDemo;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mysql.fabric.xmlrpc.base.Array;
public class Demo {

	public void replaceChar()
	{
		String username="Hello Hemant";
		System.out.println(username.replaceAll(" ", "_").toLowerCase());
	}
	public void streamApi()
	{
		Student student[] = {				
				new Student(1,"Hemant","honeeyverma@gmail.com"),
				new Student(2,"Rohit","rohit@gmal.com"),
				new Student(3,"Aayush","aayush@gmail.com")
		};
		
//		List<Student> studentlist= Arrays.asList(student);
//		Stream stream = Stream.of(studentlist);
//		stream.forEach(System.out::println);
		
		Arrays.asList(student).stream().forEach(System.out::println);
		
		Integer listofnumbers[] = {11,20,33,40,55,60,77,80,91,20};
		
		Arrays.asList(listofnumbers).stream().filter(n->n%2==0).forEach(System.out::println);
		
//		List<Integer> evennumberlist = Arrays.asList(listofnumbers).stream().filter(n->n%2==0).collect(Collectors.toList());
		
//		Set<Integer> evennumberlist = Arrays.asList(listofnumbers).stream().filter(n->n%2==0).collect(Collectors.toSet());
		
		Map<Integer,Integer> evennumberlist = Arrays.asList(listofnumbers).stream().filter(n->n%2==0).collect(Collectors.toMap(n->n, n->n, (n1,n2)->n2));
		
		for(Map.Entry<Integer, Integer> data : evennumberlist.entrySet())
		{
			System.out.println(data.getKey()+"\t"+data.getValue());
		}
		
//		for(int a:evennumberlist)
//			System.out.println("The even value "+a);
		
		System.out.println(Arrays.asList(listofnumbers).stream().filter(n->Objects.equals(n, 55)).count()>0);
		
		
		
		
	}
	
	public void checkEndsWith()
	{
		String username = "123450";
		if(username.endsWith("01"))
		{
			System.out.println("ends with 01");
		}
		else
		{
			System.out.println("End not with 01");
		}
	}
	
	public void dateExample()
	{
		LocalDate now = LocalDate.now().minusDays(1);
//        Date inputDate = Date.from(now.atStartOfDay());
        
		System.out.println(now);
	}
	
	public static void main(String[] args) {
			Demo demo = new Demo();
//			demo.replaceChar();
			
//			demo.streamApi();
//			demo.checkEndsWith();
			
			demo.dateExample();

	}

}
