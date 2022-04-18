package StackDS;

import java.util.Scanner;

//A class to represent a queue
class Queue {
	int front, rear, size;
	int capacity;
	Object array[];

	public Queue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new Object[this.capacity];
	}

	// Queue is full when size becomes equal to the capacity
	boolean isFull(Queue queue) {
		return (queue.size == queue.capacity);
	}

	// Queue is empty when size is 0
	boolean isEmpty(Queue queue) {
		return (queue.size == 0);
	}

	// Method to add an item to the queue.
	// It changes rear and size
	void enqueue(Object item) {
		if (isFull(this))
			return;
		rear = (rear + 1) % capacity;
		array[rear] = item;
		size = size + 1;
		System.out.println(item + " enqueued to queue");
	}

	// Method to remove an item from queue.
	// It changes front and size
	Object dequeue() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		Object item = array[front];
		front = (front + 1) % capacity;
		size = size - 1;
		return item;
	}

	// Method to get front of queue
	Object front() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return array[front];
	}

	// Method to get rear of queue
	Object rear() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return array[rear];
	}

	void print() {
		if (isEmpty(this)) {
			System.out.println("Queue is Empty");
		} else {
			for (int i = front; i < rear + 1; i++) {
				System.out.print(array[i] + " ");
			}
		}

	}

	public static void main(String[] args) {
		// create a queue of capacity 5
		Queue q = new Queue(5);

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		while (true) {
			System.out.println(
					"\nChoose the operation you wanted to perform :\n " + "1.Enqueue\n 2.Dequeue \n 3.Front\n 4.Rear\n "
							+ "5.Is Empty or not \n 6.Is Full or not \n " + "7.Display \n 8.Size \n 9.Exit\n");
			Scanner sc = new Scanner(System.in);
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Enter the data you wanted to insert: ");
				Object d = sc.next();
				q.enqueue(d);
				break;
			case 2:
				System.out.println(q.dequeue() + " Dequeued from the queue");
				break;
			case 3:
				System.out.println("The front element is " + q.front());
				break;
			case 4:
				System.out.println("The front element is " + q.rear());
				break;
			case 5:
				if (q.isEmpty(q)) {
					System.out.println("The queue is empty");
				} else {
					System.out.println("The queue is not empty");
				}
				break;
			case 6:
				if (q.isFull(q)) {
					System.out.println("The queue is full");
				} else {
					System.out.println("The queue is not full");
				}
				break;
			case 7:
				System.out.print("Elements present in queue :");
				q.print();
				break;

			case 8:
				System.out.println("The queue size is " + q.size);
				break;
			case 9:
				System.exit(0);
				break;

			}

		}

	}

}
