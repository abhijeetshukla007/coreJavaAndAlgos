package core.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionsWork {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println(testMethod(scanner.nextLine()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		// checked exceptions
		// compile time error will come if no try catch is there
		try {
			FileReader fileReader = new FileReader("C:/test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		Integer[][] ints = { { 1, 2, 3 }, { null }, { 7, 8, 9 } };
		System.out.println("value = " + ints[1][0].intValue());
	}

	public static String testMethod(String inp) throws Exception {
		if (inp.equals("")) {
			throw new Exception("Null input");
		}
		return inp;
	}
}
