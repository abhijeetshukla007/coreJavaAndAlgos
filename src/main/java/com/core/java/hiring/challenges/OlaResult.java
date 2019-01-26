package com.core.java.hiring.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OlaResult {
	public static void main(String[] args) {
		Comparator<Integer> comparator = (n1, n2) -> {
			String N1 = Integer.toBinaryString(n1);
			String N2 = Integer.toBinaryString(n2);

			if (getCount(N1) > getCount(N2)) {
				return 1;
			} else if (getCount(N1) == getCount(N2)) {
				return n1.compareTo(n2);
			} else {
				return -1;
			}
		};
		List<Integer> list=new ArrayList<>(Arrays.asList(7,8,6,5));
		System.out.println(Integer.toBinaryString(9));
		
		
		Collections.sort(list, comparator);

		System.out.println(list);
	}

	public static List<Integer> rearrange(List<Integer> elements) {

		return elements;
	}

	static int getCount(String n) {
		int count = 0;
		for (int i = 0; i < n.length(); i++) {
			if (n.toCharArray()[i] == '1') {
				count++;
			}
		}
		return count;
	}
}
