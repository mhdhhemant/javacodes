package com.demo.HibeDemo.pack1;

public class Demo5{

	public String threadName;
	
	Demo5(String threadName)
	{
		this.threadName=threadName;
	}
		
	public static void main(String[] args) throws InterruptedException  {
		

		Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Thread 1 running");
            }
        });
		
		Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Thread 2 running");
            }
        });
		
		t1.start();
		
		t2.start();
		t1.join();
	    t2.join();
		
	}
	
	
	public void show()
	{
		for(int i=0;i<30;i++)
		{
			if(i%2==0)
			{
				System.out.println("Thread 1 Even number : "+i);
			}
			else
			{
				System.out.println("Thread 2 Odd number : "+i);
			}
		}
	}
}
