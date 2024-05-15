package com.demo.HibeDemo;

public class Demo4 {
	
	private int count;
	private int maxCount;
	private boolean isEvenTurn;
	        
	public int add(int a, long b)
	{
		return (int) (a+b);
	}
	public int add(long a, int b)
	{
		return (int) (a*b);
	}
	
	Demo4(int maxCount)
	{
		this.maxCount = maxCount;
		this.count=1;
		this.isEvenTurn= false;
	}
	public synchronized void printEven() throws InterruptedException
	{
		while (count <= maxCount) {
            if (!isEvenTurn) {
                wait();
            } else {
                System.out.println("Even thread: " + count);
                count++;
                isEvenTurn = false;
                notify();
            }
        }
	}
	
	public synchronized void printOdd() throws InterruptedException
	{
		while (count <= maxCount) {
            if (isEvenTurn) {
                wait();
            } else {
                System.out.println("Odd thread: " + count);
                count++;
                isEvenTurn = true;
                notify();
            }
        }
	}
	public static void main(String[] args) {
		Demo4 demo = new Demo4(30);
//		int x= demo.add(2, 3L);
		
//		System.out.println(x);
		
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					demo.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					demo.printOdd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
	}
}
