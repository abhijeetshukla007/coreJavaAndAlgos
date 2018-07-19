package core.java.experiments;

public class SynchronizedTest {
	public static void main(String[] args) {
		Thread t1 = new Thread("r1");
		Thread t2 = new Thread("t2");
		t1.start();
	}

	synchronized void test() {

	}
}
