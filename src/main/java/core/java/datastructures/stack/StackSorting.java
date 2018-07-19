/**
 * 
 */
package core.java.datastructures.stack;

import java.util.Stack;

public class StackSorting {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		for (int i = 10; i > 0; i--) {
			stack.push(100 * (int) Math.random());
		}
		System.out.println(stack);
	}
}
