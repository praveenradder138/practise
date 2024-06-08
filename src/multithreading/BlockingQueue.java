package multithreading;

import java.util.LinkedList;

public class BlockingQueue {

	LinkedList<Double> list = new LinkedList<>();

	public void produce() throws InterruptedException {

		while (true) {

			synchronized (list) {

				double random = Math.random();

				System.out.println("Producing " + random);

				list.add(random);

				list.wait();
				list.notify();
				
			
			}
		}
	}

	public void consume() throws InterruptedException {

		Thread.sleep(1000);
		while (true) {

			synchronized (list) {

				System.out.println("Taking " + list.removeFirst());
				list.notify();
				list.wait();

			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue queue = new BlockingQueue();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					queue.produce();
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
					queue.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		
		t1.start();
		
		t2.start();
		
		t1.join();
		t2.join();
	}

}
