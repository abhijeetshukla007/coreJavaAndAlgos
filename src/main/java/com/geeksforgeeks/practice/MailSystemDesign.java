package com.geeksforgeeks.practice;

import java.util.Scanner;

public class MailSystemDesign {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		int N = 0, Q = 0, value = 0, oprn = 0;
		LinkedList unread = new LinkedList();
		LinkedList read = new LinkedList();
		LinkedList trash = new LinkedList();

		for (int i = 0; i < testCases; i++) {
			N = scanner.nextInt();
			for (int j = 1; j <= N; j++) {
				unread.insert(j);
			}
			Q = scanner.nextInt();
			for (int j = 0; j < Q; j++) {
				oprn = scanner.nextInt();
				value = scanner.nextInt();
				if (oprn == 1) {
					unread.delete(value);
					read.insert(value);
				} else if (oprn == 2) {
					read.delete(value);
					trash.insert(value);
				} else if (oprn == 3) {
					unread.delete(value);
					trash.insert(value);
				} else if (oprn == 4) {
					trash.delete(value);
					read.insert(value);
				}
			}
		}
		String result = unread.head != null ? "EMPTY" : unread.toString();
		System.out.println(result);
		result = read.head != null ? "EMPTY" : read.toString();
		System.out.println(result);
		result = trash.head != null ? "EMPTY" : trash.toString();
		System.out.println(result);
		scanner.close();
	}
}

class LinkedList {

	Node head;
	Node tail;

	public void insert(int value) {
		if (head == null) {
			head = new Node(value);
			tail = head;
		} else {
			tail.next = new Node(value);
			tail = tail.next;
		}
	}

	@Override
	public String toString() {
		String result = "";
		Node current = head;
		while (current != null) {
			result = result + current;
			current = current.next;
		}
		return result;
	}

	public void delete(int value) {
		Node current = this.head;
		Node prev = null;
		while (current != null && current.value != value) {
			prev = current;
			current = current.next;
		}
		if (current == null) {
			return;
		}
		if (prev == null) {
			this.head = this.head.next;
		} else
			prev.next = current.next;

	}

	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return value + " ";
		}
	}
}