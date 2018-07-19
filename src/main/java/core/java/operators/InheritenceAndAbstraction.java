/**
 * 
 */
package core.java.operators;

import java.io.Serializable;

/**
 * @author abhijeet
 *
 */
public class InheritenceAndAbstraction implements Interface1, Interface2 ,Serializable{

	public static void main(String[] args) {
		// System.out.println(x); The field x is ambiguous CE
	}

	@Override
	public int m1() {
		return 0;
	}

	@Override
	public void m1a() {
		// TODO Auto-generated method stub

	}

}

// always throw comile time error as