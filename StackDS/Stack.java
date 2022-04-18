package StackDS;

import java.util.Scanner;

class Stack {
	static final int MAX = 1000;
	int top;
	Object a[] = new Object[MAX]; // Maximum size of Stack

	boolean isEmpty() {
		return (top < 0);
	}
	
	boolean isFull()
	{
		if(top==MAX-1) return true;
		else return false;
	}
	Stack() {
		top = -1;
	}

	boolean push(Object x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	Object pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			Object x = a[top--];
			return x;
		}
	}

	Object peek() {
		if (top < 0) {
			System.out.println("Stack is Empty");
			return 0;
		} else {
			Object x = a[top];
			return x;
		}
	}

	void print() {
		for (int i = top; i > -1; i--) {
			System.out.print(" " + a[i]);
		}
	}
	
	int size()
	{
		return top+1;
	}
	
	public static void main(String args[]) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		while(true)
		{
			System.out.println("\nChoose the operation you wanted to perform :\n "
					+ "1.Push\n 2.Pop \n 3.Peek\n "
					+ "4.Is Empty or not \n 5.Is Full or not \n "
					+ "6.Display \n 7.Size \n 8.Exit\n");
			Scanner sc = new Scanner(System.in);
				int opt = sc.nextInt();
				switch(opt)
				{
				case 1:
						System.out.println("Enter the data you wanted to Push: ");
				        Object d=sc.next();
				        s.push(d);
				        break;
				case 2:
						System.out.println(s.pop() + " Popped from stack");
						break;
				case 3:
						System.out.println("Top element is :" + s.peek());
						break;
				case 4:	s.isEmpty(); break;
				case 5:	s.isFull(); break;
				case 6:	System.out.print("Elements present in stack :");
						s.print(); break;
				
				case 7: int size= s.size();
						System.out.println(size);
						break;
				case 8: System.exit(0);
						break;
					
				}
			
		}
	}
}
