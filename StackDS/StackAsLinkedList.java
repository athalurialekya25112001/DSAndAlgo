package StackDS;

import java.util.Scanner;

//Java Code for Linked List Implementation

public class StackAsLinkedList {

	StackNode root = null;

	class StackNode {
		Object data;
		StackNode next;

		StackNode(Object data) {
			this.data = data;
		}
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		} else
			return false;
	}

	public void push(Object data) {
		StackNode newNode = new StackNode(data);

		if (root == null) {
			root = newNode;
		} else {
			/*
			 * StackNode temp = root; root = newNode; newNode.next = temp;
			 */
			newNode.next = root;
			root = newNode;

		}
		System.out.println(data + " pushed to stack");
	}

	public Object pop() {
		Object popped = Integer.MIN_VALUE;
		if (root == null) {
			System.out.println("Stack is Empty");
		} else {
			popped = root.data;
			root = root.next;
		}
		return popped;
	}

	public Object peek() {
		if (root == null) {
			System.out.println("Stack is empty");
			return Integer.MIN_VALUE;
		} else {
			return root.data;
		}
	}

	public void print(StackNode root) {
		if (root == null)
			return;
		print(root.next);
		System.out.print(root.data + " ");
	}

	public int size() {
		StackNode temp = null;
		temp = root;
		int c = 0;
		if (root == null)
			return 0;
		else {
			while (temp != null) {
				c++;
				temp = temp.next;
			}
			return c;
		}
	}

	public static void main(String[] args) {

		StackAsLinkedList sll = new StackAsLinkedList();

		sll.push(10);
		sll.push(20);
		sll.push(30);

		while (true) {
			System.out.println("\nChoose the operation you wanted to perform :\n " + "1.Push\n 2.Pop \n 3.Peek\n "
					+ "4.Is Empty or not \n " + "5.Display \n 6.Size \n 7.Exit\n");
			Scanner sc = new Scanner(System.in);
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Enter the data you wanted to Push: ");
				Object d = sc.next();
				sll.push(d);
				break;
			case 2:
				System.out.println(sll.pop() + " Popped from stack");
				break;
			case 3:
				System.out.println("Top element is :" + sll.peek());
				break;
			case 4:
				sll.isEmpty();
				break;
			case 5:
				System.out.print("Elements present in stack :");
				sll.print(sll.root);
				break;

			case 6:
				int size = sll.size();
				System.out.println("The size of the stack is " + size);
				break;
			case 7:
				System.exit(0);
				break;

			}

		}
	}
}
