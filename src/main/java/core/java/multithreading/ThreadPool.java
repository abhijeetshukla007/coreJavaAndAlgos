/**
 * 
 */
package core.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author abhijeet
 *
 */
public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 10; i++) {
			Runnable runnable = new ExecutorClass("My worker thread:" + i);
			executorService.execute(runnable);
		}
		executorService.shutdown();
		while (!executorService.isTerminated()) {}
			System.out.println("Done with executor service");
		
	}

}

class ExecutorClass implements Runnable {

	private String name;

	public ExecutorClass(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Start thread " + name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ended thread " + name);

	}

}