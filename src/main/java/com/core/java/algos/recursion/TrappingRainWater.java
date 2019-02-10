/**
 * 
 */
package com.core.java.algos.recursion;

/**
 * @author abhij
 *
 */
public class TrappingRainWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int size=scanner.nextInt();
		int[] height = new int[size];

		for (int i = 0; i < height.length; i++) {
			height[i] = scanner.nextInt();
		}
		System.out.println(trap(height));
		scanner.close();
	}

	public static int trap(int[] height) {
		int p1 = 0, temp = 0, capacity = 0, p2 = 0;
		for (int i = 0; i < height.length - 1; i++) {
			if (height[i] >= height[p1] && height[i] >= height[i + 1]) {
				if (p1 == 0) {
					p1 = i;
					p2 = p1 + 1;
				} else {
					capacity = capacity + (Math.min(height[i], height[p1]) * (i - p1 - 1)) - temp;
					p1 = i;
				}
				temp = 0;
			} else if ((i + 1) == height.length - 1) {
				if (height[i] >= height[p2]||height[i+1]>=height[p2]) {
					p2 = height[i]>height[i+1]?i:i+1;
					temp = temp + height[i];
				}
				capacity = capacity + (Math.min(height[p2], height[p1]) * (p2 - p1 - 1)) - temp;
				p1 = i;
			} else {
				temp = temp + height[i];
				if (height[i] >= height[p2]) {
					p2 = i;
				}
			}
		}
		return capacity;
	}
}
