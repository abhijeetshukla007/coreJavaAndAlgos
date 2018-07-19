package core.java.experiments;

import java.io.OutputStream;

abstract class AbstractTest {
	public void test() throws CloneNotSupportedException {
		System.out.println("parent test");
	}

	public AbstractTest() {
		super();
		System.out.println("AbstractTest constructor called");
	}

	protected abstract void m1();

	public abstract void m1(String t);

}

abstract class C extends AbstractTest {
	OutputStream os = null;
	// @Override
	// public void test() {
	//
	// }

	/* it can be commented too */
	@Override
	protected abstract void m1();
}

class D extends C {
	@Override
	public strictfp void m1() {
		System.out.println("called C strictfp");
	}

	@Override
	public void m1(String t) {
		System.out.println("called C m1 normal");

	}

	@Override
	public void test() throws CloneNotSupportedException {
		try {
			System.out.println("child");
		} catch (Exception e) {
			System.out.println("in abstract D");
		}
	}
}

public class E extends D {
	@Override
	public void test() throws CloneNotSupportedException {
		System.out.println("child");
		D d1 = (D) super.clone();
		d1.m1();
	}

	public static void main(String[] args) {
		
		
		try {
			C c =  new D();
			c.m1();
			D d = new D();

		} catch (Exception e) {
			throw new NullPointerException();
		} finally {
			System.out.println("in finally");
		}
	}
}