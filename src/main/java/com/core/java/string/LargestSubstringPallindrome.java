package com.core.java.string;

public class LargestSubstringPallindrome {

	static CharSequence maxPallindrome = "";

	public static void main(String[] args) {
		// findLargestPallindrome("qwieunabhabhjhbahbajfjaaaabbaaaaklkfsjre");
		findLargestPallindrome("forgeeksskeegfor");
	}

	private static void findLargestPallindrome(String str) {
		for (int i = 1; i < str.length(); i++) {
			if (i == 1) {
				isPallindrome(str, i, i - 1);
			} else {
				isPallindrome(str, i, i - 1);
				isPallindrome(str, i, i - 2);
			}
		}
		System.out.println("Largest pallindrome is " + maxPallindrome);
	}

	private static CharSequence isPallindrome(String str, int end, int start) {
		boolean isaPallindrome = true;
		while (isaPallindrome && start >= 0 && end < str.length()) {
			if (str.charAt(start) != str.charAt(end)) {
				isaPallindrome = false;
			} else {
				if (str.substring(start, end + 1).length() > maxPallindrome.length()) {
					maxPallindrome = str.substring(start, end + 1);
				}
				start--;
				end++;
			}
		}
		return maxPallindrome;
	}
}
