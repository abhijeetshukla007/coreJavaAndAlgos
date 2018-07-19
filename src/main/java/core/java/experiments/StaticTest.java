/**
 * 
 */
package core.java.experiments;

/**
 * @author abhijeet
 *
 */
public class StaticTest {

	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
		System.out.println(StaticTest.test());
		staticTest=null;
		System.out.println(StaticTest.test());
	}

	static boolean test() {
		System.out.println("qwertyu");
		return true;
	}

}
