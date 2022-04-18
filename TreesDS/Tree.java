package TreesDS;

import java.util.Scanner;

public class Tree {
	static class Node
	{
		int data;
		Node left, right;
		
		public Node(int data)
		{
			this.data=data;
		}
	}
	
	static Node createTree()
	{
		Node root=null;
		System.out.println("Enter data: ");
		int data= sc.nextInt();
		if(data==-1) return null;
		
		root=new Node(data);
		
		System.out.println("Enter left for "+data);
		root.left=createTree();
		
		System.out.println("Enter right for "+data);
		root.right=createTree();
		
		return root;
	}
	static void preOrder(Node root)
	{
		if(root==null) return ;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	static void postOrder(Node root)
	{
		if(root==null) return ;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	static void inOrder(Node root)
	{
		if(root==null) return ;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	static Scanner sc= null;
	public static void main(String args[])
	{
		
		sc= new Scanner(System.in);
		
		Node root=createTree();
		System.out.println("The PreOrder is : ");
		preOrder(root);
		System.out.println();
		System.out.println("The PostOrder is : ");
		postOrder(root);
		System.out.println();
		System.out.println("The InOrder is : ");
		inOrder(root);
		System.out.println();
	}
	
}
