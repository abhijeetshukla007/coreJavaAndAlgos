package com.core.java.hackerrank.practice;

import java.math.BigInteger;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		long[] temp = new long[1477045];
		BigInteger bigInteger = new BigInteger(String.valueOf(temp.length));
		bigInteger = bigInteger.multiply(BigInteger.valueOf((temp.length - 1) / 2));
		bigInteger = bigInteger.multiply(BigInteger.valueOf(992977));
		System.out.println(bigInteger);
		System.out.println(bigInteger.mod(BigInteger.valueOf(1000000007)));

		BigInteger bigInteger2 = new BigInteger("1477045");
		bigInteger2 = bigInteger2.multiply(BigInteger.valueOf(1477044 / 2));
		bigInteger2 = bigInteger2.multiply(new BigInteger("992977"));

		System.out.println(bigInteger2);
		System.out.println(bigInteger2.mod(BigInteger.valueOf(1000000007)));
		int[] temss = { 1, 2, 3, 5, 6, 5, 7, 8, 2 ,4};
			System.out.println(Arrays.copyOfRange(temss, 0, temss.length / 2));
			System.out.println(Arrays.toString(Arrays.copyOfRange(temss, temss.length / 2,temss.length)));

		

	}

}
//621621650 

//A .length 1477045
//992977

//1477045
//2181660454980
//2166338653604675460
//440304994