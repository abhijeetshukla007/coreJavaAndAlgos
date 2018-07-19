/**
 * 
 */
package core.java.experiments;

import java.util.Scanner;

/**
 * @author abhijeet
 *
 */
public class Fibbonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = 0;
		length = scanner.nextInt();
		System.out.println();
		for (int i = 0; i < length - 1; i++) {
			System.out.print(fibbonacci(i)+" ");
		}
		scanner.close();
	}

	static int fibbonacci(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 0) {
			return 0;
		} else {
			return fibbonacci(n - 1) + fibbonacci(n - 2);
		}

	}
}
