package core.java.multithreading;

public class Test1 extends Thread {

	@Override
	public void run() {

		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.print(e);
			}
			System.out.print(i);
		}
	}

	public static void main(String args[]) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		/*
		 * t1.run(); t2.run();
		 */
		
		System.out.println("01-da1925f0-c01b-11e6-8c98-a7787795551d".toUpperCase());
		System.out.println("US-444AD440-E42F-11E7-85F4-FDD2CA402ABE".toLowerCase());
		System.out.println("\nstart");
		t1.start();
		t2.notify();
	}
}

class test2 implements Runnable {

	@Override
	public void run() {
		System.out.println("runnable");
	}

	public static void main(String[] args) {
		System.out.println("01-da1925f0-c01b-11e6-8c98-a7787795551d".toUpperCase());
		System.out.println("US-444AD440-E42F-11E7-85F4-FDD2CA402ABE".toLowerCase());


		Thread t1 = new Thread(new test2());
		t1.start();
	}
}
