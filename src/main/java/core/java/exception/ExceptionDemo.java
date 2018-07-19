/**
 * 
 */
package core.java.exception;

import javax.jws.Oneway;

/**
 * @author M1034403
 *
 *
 *         Exception should b
 */

class Encrypter{
	public static String encrhkj(String yiyu) {
		if (yiyu.length()<4) {
			throw new IllegalArgumentException("ertyu");
		}
		StringBuilder buffer=new StringBuilder(yiyu.toLowerCase());
		yiyu=buffer.reverse().toString();
		System.out.println(yiyu);
		return yiyu;
		
	}
	public String  test() {
		// TODO Auto-generated method stub
return null;
	}
}
public class ExceptionDemo {
	
	
	private ExceptionDemo demo;
	void start() {
		this.takeDemo(demo);
	}
	void takeDemo(ExceptionDemo demo) {
		
	}
	public static void main(String[] args) {
		
		System.out.println("qwerty".substring(0, 2));
		Encrypter encrypter=new Encrypter();
		encrypter.test();
		
		System.out.println(Encrypter.encrhkj("wer"));
		
		class Inner{
			final Integer i6=9;
			Integer i7=9;
			
			Inner(){
				System.out.println(i6+i7);
			}
		}
		int i=010;
		int j=07;
		System.out.println(i+ ""+ j);
		try {

			throw new CustomException2();
		} catch (NumberFormatException e) {
		} catch (IllegalArgumentException e) {
		} catch (Exception e) {

		}

	}
}

class CustomException extends Exception {

}

class CustomException2 extends CustomException {

}
