package com.threadspro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.threadspro.javaclass.MyRunnable;

// @SpringBootApplication
public class ThreadsProApplication extends Thread {

	public static void main(String[] args) {
		//SpringApplication.run(ThreadsProApplication.class, args);
		MyRunnable myThreads = new MyRunnable("a ");
		MyRunnable myThread = new MyRunnable("b ");
		//myThreads.run();
		
		 
		Thread t = new Thread(myThreads);
		Thread t1 = new Thread(myThread);
		t.setPriority(MIN_PRIORITY);
	
		t1.setPriority(MAX_PRIORITY);
		System.out.println( "a " +t.isDaemon());
		t.setDaemon(true);
		
		System.out.println( "a " +t.isDaemon());
		
		t1.start();
		try {
			java.util.concurrent.TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.start();
		
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
		System.out.println( "Hello World");
	
		
		
		
	}
	


}
