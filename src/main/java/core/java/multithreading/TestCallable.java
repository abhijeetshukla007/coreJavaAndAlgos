/**
 * 
 */
package core.java.multithreading;

import java.util.concurrent.Callable;

/**
 * @author abhijeet
 *
 */
public class TestCallable extends Thread implements Callable<String> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.concurrent.Callable#call()
	 */
	@Override
	public String call() throws Exception {
		return "test";
	}

	public static void main(String[] args) throws Exception {
		TestCallable callable = new TestCallable();
		System.out.println(callable.call());
	}
}
