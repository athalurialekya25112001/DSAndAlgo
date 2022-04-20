package GraphDS;

import java.util.*;

public class Graph {
	
	class Edge{
		int dst,w;
		public Edge(int dst,int w)
		{
			this.dst=dst;
			this.w=w;
		}
		
		@Override
		public String toString()
		{
			return "{"+dst+", w = "+w+"}";
		}
	}
	
	List<Edge> []G;
	
	public Graph(int n)
	{
		G= new LinkedList[n];
		for(int i=0;i<G.length;i++)
		{
			G[i]= new LinkedList<Edge>();
		}
	}
	
	@Override
	public String toString()
	{
		String result="";
		for(int i=0;i<G.length;i++)
		{
			result+=i+"=>"+G[i]+"\n";
		}
		return result;
	}
	
	public void addEdge(int src, int dst,int w)
	{
		//for undirected graph 
		G[src].add(0,new Edge(dst,w));
		G[dst].add(0,new Edge(src,w));
	}
	
	boolean isConnected(int src, int dst)
	{
		for(Edge i: G[src])
		{
			if(i.dst==dst) return true;
		}
		return false;
	}
	
	public static void main(String args[])
	{
		int n=6;
		Graph g= new Graph(n);
		 
		 
		 g.addEdge(0, 1, 5);
		 g.addEdge(0, 2, 6);
		 g.addEdge(1, 5, 3);
		 g.addEdge(2, 3, 2);
		 g.addEdge(2, 4, 1);
		 g.addEdge(2, 5, 7);
		 g.addEdge(3, 4, 5);
		 g.addEdge(4, 5, 1);

		 //System.out.println(g.isConnected(2, 3));
		 System.out.println(g);
		 	
	}
}
