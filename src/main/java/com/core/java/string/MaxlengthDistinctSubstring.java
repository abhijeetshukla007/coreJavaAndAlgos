package com.core.java.string;

public class MaxlengthDistinctSubstring {
	public static void main(String[] args) {
		System.out.println(getMaxLenSubString("abcdefwrlpaghpbjasdajalkrkrwemsdo"));
	}

	private static String getMaxLenSubString(String string) {
		String maxLengthStr = "", temp = "";
		for (int i = 0; i < string.length(); i++) {
			if (temp.contains(String.valueOf(string.charAt(i)))) {
				if (maxLengthStr.length() < temp.length()) {
					maxLengthStr = temp;
				} 
					temp = temp.substring(temp.indexOf(string.charAt(i))+1, temp.length()) + string.charAt(i);
			} else {
				temp = temp + string.charAt(i);
			}
		}

		return maxLengthStr;
	}
}
