package com.tnsif.day12.Multithreading;

import com.tnsif.day11.Thread_Multithread_Demo.MyChildThread;

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		MyChildThread myThread=new MyChildThread();
		System.out.println("Before Runnable stage Thread " +"is alive or not?" +myThread.isAlive());
		myThread.start();
		 
		try{
			Thread.sleep(4000);
		}
        catch(InterruptedException exp) {
        	System.err.println("Thread is Interrupted!" +exp);
        }
		System.out.println("After compile execution" + "of Thread,it is alive or not?" + myThread.isAlive());
	}

}
