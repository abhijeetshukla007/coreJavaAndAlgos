package com.core.java.hiring.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class KaprekarsConstant {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getCount(scanner.nextInt()));
		scanner.close();
	}

	static int getCount(int num) {
		Comparator<Integer> descComp = (i, j) -> {
			if (i > j)
				return -1;
			if (i < j)
				return 1;
			else
				return 0;
		};
		Integer[] aesc = new Integer[] { 0, 0, 0, 0 };
		Integer[] desc = new Integer[] { 0, 0, 0, 0 };
		int count = 0, difference = num;
		while (difference != 6174) {
			Arrays.fill(aesc, 0);
			Arrays.fill(desc, 0);

			aesc = getArray(difference);
			Arrays.sort(aesc);
			desc = getArray(difference);
			Arrays.sort(desc, descComp);

			difference = getDiff(aesc, desc);
			count++;
		}
		return count;
	}

	private static int getDiff(Integer[] aesc, Integer[] desc) {
		Integer no1 = 0;
		Integer no2 = 0, temp = 0;
		for (int i = 1; i <= aesc.length; i++) {
			temp = (int) (aesc[i - 1] * Math.pow(10, aesc.length - i));
			no1 = no1 + temp;
			temp = (int) (desc[i - 1] * Math.pow(10, aesc.length - i));
			no2 = no2 + temp;

		}
		return no2 - no1;
	}

	private static Integer[] getArray(int num) {
		Integer[] asec = new Integer[] { 0, 0, 0, 0 };
		String string = String.valueOf(num);
		for (int i = 0; i < string.length(); i++) {
			asec[i] = Integer.parseInt(String.valueOf(string.charAt(i)));
		}
		return asec;
	}
}
