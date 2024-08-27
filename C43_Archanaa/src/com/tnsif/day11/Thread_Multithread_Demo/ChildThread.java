package com.tnsif.day11.Thread_Multithread_Demo;

public class ChildThread extends Thread {
          private int n;
          private String msg;
          
          //Constructors(2 Parameterized Constructor)
          public ChildThread(int n,String msg) {
        	  this.n=n;
        	  this.msg=msg;
          }
          public void run() { //run() method
        	  for(int i=0;i<=n;i++) {
        		  try {
        		  Thread.sleep(300);
        	  }
        		  catch(Exception e)
        		  {
        			  System.err.println("Thread Interrupted: "+e.getMessage());
        			  
        		  }
        		  System.out.println(msg + i + " " + Thread.currentThread().getName());
        	  
          }
     }
}

