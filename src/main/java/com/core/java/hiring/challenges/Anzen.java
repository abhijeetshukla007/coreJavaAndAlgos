package com.core.java.hiring.challenges;

/*Alex has a string S of length N consisting of lowercase alphabets. He wants to find lexicographically smallest string X of length N that can be formed using the following operation.

In one operation, he can select any one character among the at most first K characters of string S, remove it from string S and append it to string X. He can apply this operation as many times as he wants.

Help Alex find the string X.

Input format

The first line consists of a string of length N
The second line consists of an integer K.
Output format

Print the lexicographically minimum string that can be formed using the above operation.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Anzen {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inp = scanner.nextLine();
		int k = scanner.nextInt();

		ArrayList<Character> charList = new ArrayList<Character>();
		String result = "";
		for (int i = 0; i < inp.length(); i++) {
			charList.add(inp.charAt(i));
		}
		int len = inp.length();
		for (int i = 0; i < len; i++) {
			char temp = charList.get(0);
			int min = 0;
			int n;
			n = len - i < k ? len - i : k;
			for (int j = 0; j < n; j++) {
				if (charList.get(j) - temp < 0) {
					temp = charList.get(j);
					min = j;
				}
			}
			result = result + charList.get(min);
			charList.remove(min);
		}
		System.out.println(result);

	}

}
