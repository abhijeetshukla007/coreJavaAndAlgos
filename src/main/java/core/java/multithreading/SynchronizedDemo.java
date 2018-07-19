/**
 * 
 */
package core.java.multithreading;

/**
 * @author abhijeet
 *
 */
public class SynchronizedDemo {
	public static void main(String[] args) {
		DemoObj demoObj = new DemoObj();

		TestThread t1 = new TestThread(demoObj);
		TestThread t2 = new TestThread(demoObj);
		try {
			t1.start();
			t2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class DemoObj {
	/**
	 * @throws InterruptedException
	 * 
	 */
	public void test(String value) throws InterruptedException {

		System.out.println(value + "first");
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				Thread.sleep(100);
			}
		}
		System.out.println(value + "last");
	}
}

class TestThread extends Thread {
	DemoObj demoObj;

	TestThread(DemoObj demoObj) {
		this.demoObj = demoObj;
	}

	@Override
	public void run() {
		try {
			demoObj.test("abhijeet");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
