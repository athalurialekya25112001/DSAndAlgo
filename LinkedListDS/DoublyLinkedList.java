package LinkedListDS;

import java.util.Scanner;

public class DoublyLinkedList {
	class Node {
		Object data;
		Node next;
		Node prev;

		Node(Object data2) {
			this.data = data2;
			this.next = null;
			this.prev = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void insertAtEnd(Object data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			n.prev = temp;
		}
	}

	public void insertAtBegin(Object data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head.prev = n;
			head = n;
		}
	}

	public void insertAtPos(int pos, Object data) {
		Node n = new Node(data);

		if (pos == 0) {
			insertAtBegin(data);
		} else {
			Node temp = head;

			for (int i = 0; i < pos - 1 && temp != null; i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			n.prev = temp;
			if (temp.next != null)
				temp.next.prev = n;
			temp.next = n;
		}
	}

	public int size() {
		Node temp = head;
		int c = 0;
		while (temp != null) {
			temp = temp.next;
			c++;
		}
		return c;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("No data to delete");
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	public void deleteAtBegin() {
		if (head == null) {
			System.out.println("No data to delete");
			return;
		} else if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}
	}

	public void deleteAtPos(int pos) {
		if (head == null) {
			System.out.println("No data to delete");
			return;
		}
		if (pos == 0) {
			head = head.next;
		} else {
			Node temp = head;
			for (int i = 0; i < pos - 1 && temp != null; i++) {
				temp = temp.next;
			}
			if (temp == null) {
				return;
			}

			if (temp.next != null) {
				temp.next.prev = temp.prev;
			}
			if (temp.prev != null) {
				temp.prev.next = temp.next;
			}
		}

	}

	public static void main(String args[]) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertAtEnd('a');
		dll.insertAtEnd('c');
		dll.insertAtEnd('d');
		dll.insertAtEnd('e');
		dll.insertAtEnd('f');

		while (true) {
			System.out.println("Choose the operation you wanted to perform :\n "
					+ "1.Insert At End\n 2.Insert At Beginning \n 3.Insert At Position\n "
					+ "4.Delete At End\n 5.Delete At Beginning \n 6.Delete At Position\n "
					+ "7.Display  \n 8.Length of linked list \n 9.Exit\n");
			Scanner sc = new Scanner(System.in);
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Enter the data you wanted to insert at end: ");
				Object d = sc.next();
				dll.insertAtEnd(d);
				break;
			case 2:
				System.out.println("Enter the data you wanted to insert at beginning: ");
				Object d1 = sc.next();
				dll.insertAtBegin(d1);
				break;
			case 3:
				System.out.println("Enter the position: ");
				int p = sc.nextInt();
				System.out.println("Enter the data you wanted to insert at position: ");
				Object d2 = sc.next();
				dll.insertAtPos(p, d2);
				break;
			case 4:
				dll.deleteAtEnd();
				break;
			case 5:
				dll.deleteAtBegin();
				break;
			case 6:
				System.out.println("Enter the position you wnated to delete : ");
				int p1 = sc.nextInt();
				dll.deleteAtPos(p1);
				break;
			case 7:
				dll.display();
				break;
			case 8:
				int s = dll.size();
				System.out.println(s);
				break;
			case 9:
				System.exit(0);
				break;

			}
		}

	}
}
