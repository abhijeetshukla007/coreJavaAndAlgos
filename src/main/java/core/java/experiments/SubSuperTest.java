package core.java.experiments;

public class SubSuperTest extends Parent {
	public SubSuperTest() {
		super(1);
	}

	static int a = 2;

	public static void main(String[] args) {
		System.out.println(a);
		SubSuperTest subSuperTest = new SubSuperTest();
		subSuperTest.testSuper();
	}

	public void testSuper() {
		System.out.println(super.a);
		System.out.println(SubSuperTest.a);
	}
}

class Parent {
	public Parent(int s) {
		System.out.println("Parent construct called"+s);
	}

	static int a, b;
}
class Base {
	  private void fun() {
	     System.out.println("Base fun");     
	  }
	}
	   
	