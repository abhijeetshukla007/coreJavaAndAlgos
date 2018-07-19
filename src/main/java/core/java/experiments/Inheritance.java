package core.java.experiments;

/* Java program to demonstrate whether we can override private method 
of outer class inside its inner class */
public class Inheritance {
	public String msg = "GeeksforGeeks";

	public void fun() {
		System.out.println("Outer fun()");
	}

	class Inner extends Inheritance {
		@Override
		public void fun() {
			System.out.println("Accessing Private Member of Outer: " + msg);
		}
	}

	public static void main(String args[]) {

		// In order to create instance of Inner class, we need an Outer
		// class instance. So, first create Outer class instance and then
		// inner class instance.
		Inheritance o = new Inheritance();
		Inner i = o.new Inner();

		// This will call Inner's fun, the purpose of this call is to
		// show that private members of Outer can be accessed in Inner.
		i.fun();

		// o.fun() calls Outer's fun (No run-time polymorphism).
		o = i;
		o.fun();
		demo demo=new demo();
		demo.test();
	}
}

class demo extends test {
	public String msg = "GeeksforG0ooks";
	public void test() {
		System.out.println(this.msg);
	}
	@Override
	void tuyu() {
		// TODO Auto-generated method stub
		
	}
}
abstract class test{
	abstract void tuyu();
}