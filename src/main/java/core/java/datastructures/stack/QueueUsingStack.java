package core.java.datastructures.stack;

import java.util.Stack;

public class QueueUsingStack<T> {
	Stack<T> s1 = new Stack<>();
	Stack<T> s2 = new Stack<>();

	public static void main(String[] args) {
		QueueUsingStack<Integer> queue = new QueueUsingStack<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println(queue.poll());
		queue.add(5);
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

	T poll() {
		return s2.pop();
	}

	void add(T t) {
		int size = s2.size();
		for (int i = 0; i < size; i++) {
			s1.add(s2.pop());
		}
		s1.push(t);
		size = s1.size();
		for (int i = 0; i < size; i++) {
			s2.add(s1.pop());
		}
	}
}
