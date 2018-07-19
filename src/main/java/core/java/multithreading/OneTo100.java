/**
 * 
 */
package core.java.multithreading;

/**
 * @author abhijeet
 *
 */
public class OneTo100 implements Runnable {
	int counter = 1;

	public static void main(String[] args) throws InterruptedException {
		OneTo100 oneTo100 = new OneTo100();

		Thread t1 = new Thread(oneTo100);
		Thread t2 = new Thread(oneTo100);
		t1.start();
		t2.start();			
	}

	@Override
	public void run() {
		while (counter < 101) {
			synchronized (this) 	
			{
				System.out.println(Thread.currentThread().getName() + " " + counter);
			
			counter++;
			this.notify();
			try {
					this.wait();
				} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}

}
