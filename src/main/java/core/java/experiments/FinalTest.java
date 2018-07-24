package core.java.experiments;

public final class FinalTest {
	private final int id;
	{
		id = 0;
	}

	public FinalTest() {
		super();
	}

	public static final void testMethod() {

	}

	public static void main(String[] args) {

	}
}

class FinalMethod {

	public final void testMethod() {
		FinalTest finalTest = new FinalTest();
		FinalTest.testMethod();
		FinalTest.main(null);
	}
}

/*
 * givet CTError as final method can't be overridden class test extends
 * FinalMethod { public void testMethod() {
 * 
 * } }
 */
/*
 * gives compile time error class test extends FinalTest{
 * 
 * }
 */
