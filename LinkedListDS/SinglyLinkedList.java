package LinkedListDS;

import java.util.Scanner;

public class SinglyLinkedList {
	class Node
	{
		Object data;
		Node next;
		
		Node(Object data2)
		{
			this.data=data2;
			this.next=null;
		}
	}
	public Node head =null;
	public Node tail=null;
	public void insertAtEnd(Object data)
	{
		Node n = new Node(data);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}			
	}
	public void insertAtBegin(Object data)
	{
		Node n = new Node(data);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp=head;
			head=n;
			n.next=temp;
		}			
	}
	public void insertAtPos(int pos ,Object data)
	{
		Node n = new Node(data);
		
		if(pos==0)
		{
			insertAtBegin(data);
		}
		else 
		{
			Node temp=head;
			for(int i=0;i<pos-1;i++)
			{
				temp=temp.next;			
			}
			n.next=temp.next;
			temp.next=n;
		}
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("No data exists");
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				System.out.print(temp.data+" ");
				temp =temp.next;
			}
			System.out.println(temp.data);
		}
	}
	public void deleteAtEnd()
	{
		if(head==null)
		{
			System.out.println("No data exists");
		}
		else
		{
			Node temp=head;
			while(temp.next.next!=null)
			{
				temp =temp.next;
			}
			temp.next=null;
		}
	}
	public void deleteAtBegin()
	{
		if(head==null)
		{
			System.out.println("No data exists");
		}
		else if(head.next==null)
		{
			head=null;
		}
		else
		{
			Node temp=head;
			Node temp1=head.next;
			temp.next=null;
			head=temp1;
		}
	}
	public void deleteAtPos(int pos)
	{
		if(pos==0)
		{
			head=head.next;
		}
		else
		{
			Node temp= head;
			Node temp1=null;
			for(int i=0;i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp1=temp.next;
			temp.next=temp1.next;
			temp1=null;
		}
	}
	public static void main(String args[])
	{
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insertAtEnd(5);	
		sll.insertAtEnd(6);
		sll.insertAtEnd(567);
		sll.insertAtEnd(89);
		sll.insertAtEnd(56);
		

						
		while(true)
		{
			System.out.println("Choose the operation you wanted to perform :\n "
					+ "1.Insert At End\n 2.Insert At Beginning \n 3.Insert At Position\n "
					+ "4.Delete At End\n 5.Delete At Beginning \n 6.Delete At Position\n "
					+ "7.Display  \n 8.Exit\n");
			Scanner sc = new Scanner(System.in);
			int opt = sc.nextInt();
			switch(opt)
			{
			case 1:
					System.out.println("Enter the data you wanted to insert at end: ");
			        Object d=sc.next();
			        sll.insertAtEnd(d);
			        break;
			case 2:
					System.out.println("Enter the data you wanted to insert at beginning: ");
					Object d1=sc.next();
					sll.insertAtBegin(d1);
					break;
			case 3:
					System.out.println("Enter the position: ");
					int p=sc.nextInt();
					System.out.println("Enter the data you wanted to insert at position: ");
					Object d2=sc.next();
					sll.insertAtPos(p,d2);
					break;
			case 4:	sll.deleteAtEnd(); break;
			case 5:	sll.deleteAtBegin(); break;
			case 6:	System.out.println("Enter the position you wnated to delete : ");
					int p1=sc.nextInt();
					sll.deleteAtPos(p1); break;
			case 7: sll.display();
					break;
			case 8: System.exit(0);
					break;
				
			}
		}
		
	}
}
