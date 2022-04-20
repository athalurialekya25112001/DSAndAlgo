package GreedyAlgos;

import java.util.*;

public class Huffman {
	static class Node
	{
		char ch;
		int frequency;
		Node left=null,right=null;
		
		public Node(char ch, int frequency)
		{
			this.ch=ch;
			this.frequency= frequency;
		}

		public Node(Object object, int sum, Node left2, Node right2) 
		{
			this.right=right2;
			this.left=left2;
			this.frequency=sum;
		}
	}
	private static void buildHuffmanTree(String text) {
		if(text==null || text.length()==0) return;
		
		Map<Character, Integer> frequency = new HashMap<Character,Integer>();
		
		for(char ch: text.toCharArray())
		{
			if(!(frequency.containsKey(ch)))
			frequency.put(ch,1);
			else
			{
				int x=frequency.get(ch);
				frequency.replace(ch,x,x+1);
			}	
		}
		
		System.out.println(frequency);
		PriorityQueue<Node> pq= new PriorityQueue<Node>(Comparator.comparingInt(l->l.frequency));
		
		for(var em:frequency.entrySet())
		{
			pq.add(new Node(em.getKey(),em.getValue()));
		}
		
		while(pq.size()!=1)
		{
			Node left=pq.poll();
			Node right=pq.poll();
			
			int sum= left.frequency+right.frequency;
			
			pq.add(new Node(null,sum,left,right));
		}
		Node root= pq.peek();
		
		Map<Character, String> huffmanCode= new HashMap<>();
		encode(root,"",huffmanCode);
		
		System.out.println("Huffman codes are : "+huffmanCode);
		System.out.println("The original string is : "+text);
		
		StringBuilder sb = new StringBuilder();
		for(char c: text.toCharArray())
		{
			sb.append(huffmanCode.get(c));
		}
		
		System.out.println("The encoded string is: " + sb);
		
	}
	
	private static void encode(Node root, String string, Map<Character, String> huffmanCode) {
		if(root == null ) return;
		if(isLeaf(root))
		{
			huffmanCode.put(root.ch, string.length()>0? string :"1");
		}
		encode(root.left,string+'0',huffmanCode);
		encode(root.right,string+'1',huffmanCode);
	}
	
	private static void decode(Node root)
	{
		
	}
	private static boolean isLeaf(Node root) {
		return (root.left==null && root.right==null);		
	}

	public static void main(String args[])
	{
		String text= "ABBCDBCCDAABBEEEBEAB";
		buildHuffmanTree(text);
	}

	
}
