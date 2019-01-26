package core.java.datastructures.stack;

import java.util.PriorityQueue;
import java.util.Queue;

public class StackUsingQueue<T> {
	Queue<T> queue1 = new PriorityQueue<T>();
	Queue<T> queue2 = new PriorityQueue<T>();

	public static void main(String[] args) {
		StackUsingQueue<Integer> queue = new StackUsingQueue<>();
		queue.push(8);
		queue.push(2);
		queue.push(5);
		queue.push(1);
		System.out.println(queue.pop());
		queue.push(7);
		System.out.println(queue.pop());

	}

	void push(T t) {
		queue1.add(t);
	}

	T pop() {
		int size = queue1.size();
		for (int i = 0; i < size - 1; i++) {
			queue2.add(queue1.poll());
		}
		T t = queue1.poll();
		queue1.addAll(queue2);
		queue2.clear();
		return t;
	}
}
