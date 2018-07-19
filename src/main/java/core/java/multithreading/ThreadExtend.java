/**
 * 
 */
package core.java.multithreading;

/**
 * @author abhijeet
 *
 */
public class ThreadExtend extends Thread {
	public static void main(String[] args) {
		ThreadExtend t1 = new ThreadExtend();
		ThreadExtend t2 = new ThreadExtend();
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}
