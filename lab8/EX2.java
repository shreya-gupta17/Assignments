package com.capgemini.lab8;
import java.text.SimpleDateFormat;
import java.util.Date;
public class EX2 implements Runnable{
	public synchronized void display() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	@Override
	public void run() {
		System.out.print("Time Now : ");
		while(true) {
			try {
				display();
				Thread.sleep(5000);
				System.out.print("Time after 5 seconds : ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
    
		EX2 threadtimer=new EX2();
		Thread thread=new Thread(threadtimer);
		thread.start();
	}
}