package TreesDS;

import java.util.Scanner;

public class BST {
	static class BSTNode
	{
		int data;
		BSTNode left, right;
		
		public BSTNode(int data)
		{
			this.data=data;
			this.left=this.right=null;
		}
	}
	private BSTNode insert(BSTNode root,int data) {
		if(root==null) root= new BSTNode(data);
		else if(data<=root.data) root.left=insert(root.left,data);
		else root.right=insert(root.right,data);
		return root;
	}
	
	private static boolean search(BSTNode root, int num) {
		if(root==null) return false;
		else if(num==root.data) return true;
		else if(num<root.data) return search(root.left,num);
		else return search(root.right,num);
	}
	private int max(BSTNode root) {
		if(root==null) { System.out.println("Empty Tree"); return -1;}
		else if(root.right==null) return root.data;
		
		return max(root.right);
	}

	private int min(BSTNode root) {
		if(root==null) { System.out.println("Empty Tree"); return -1;}
		else if(root.left==null) return root.data;
		
		return max(root.left);
	}
	public static void main(String [] args)
	{
		BSTNode root=null;
		BST b= new BST();
		root=b.insert(root,10);
		root=b.insert(root,34);
		root=b.insert(root,15);
		root=b.insert(root, 5);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be searched: ");
		int num= sc.nextInt();
		if(search(root,num)==true) System.out.println("Found");
		else System.out.println("Not found");
		int min = b.min(root);
		int max= b.max(root);
		System.out.println("Minimum is "+min);
		System.out.println("Maximum is "+max);
	}
	
}
