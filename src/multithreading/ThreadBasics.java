package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadBasics {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		
		System.out.println(Thread.currentThread().getId());
		// by extending
		//Thread thread1 = new ThreadDemo();

		// by runnable
		Thread thread2 = new Thread(new Runnable() {

			// runabble cannot throw checked exception
			@Override
			public void run() {

				System.out.println("Thread 2 started");

			}
		});

		// by runnable using lamdda
		Thread thread3 = new Thread(() -> System.out.println("Thread 3 started"));

		
		//thread1.setDaemon(true);//makes it deamon
		//thread1.start();
		// thread1.start();//IllegalThreadStateException
		thread2.start();
		thread3.start();

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);

		Future<String> future = newFixedThreadPool.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {

				return "Hello world";
			}

		});

		System.out.println(future.get());
		
		ThreadDemo t1  = new ThreadDemo();
		t1.start();
		ThreadDemo t2  = new ThreadDemo();
		t2.start();
		
		t1.wait();
	}

}

class ThreadDemo extends Thread {



	@Override
	public void run() {

		try {
			method();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	synchronized void method() throws InterruptedException {
		
		for(int i=0 ; i<1000 ;i++) {
			
			
			System.out.println(Thread.currentThread().getId()+ "I is "+i);
			
			
		}
		
		
	}

}
