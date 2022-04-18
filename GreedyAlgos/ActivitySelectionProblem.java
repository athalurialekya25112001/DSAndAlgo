package GreedyAlgos;

public class ActivitySelectionProblem{
	static class Activity
	{
		int start,finish;
		public Activity(int start,int finish)
		{
			this.start=start;
			this.finish=finish;
		}
	}
	
	private static Activity[] sort(Activity[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j].finish>arr[j+1].finish)
				{
					Activity temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	private static void PrintActivity(Activity[] sortedarr) {
		System.out.println("Maximum Activities to be performed ");
		System.out.println(sortedarr[0].start+" "+sortedarr[0].finish);
		int j=0;
		for(int i=1;i<sortedarr.length;i++)
		{
			int e=sortedarr[j].finish;
			int s=sortedarr[i].start;
			if(s>=e)
			{
				System.out.println(sortedarr[i].start+" "+sortedarr[i].finish);
				j=i;
			}
		}
		
	}
	
	public static void main(String args[])
	{
		int n=6;
		Activity arr[] = new Activity[n];
		
		arr[0]=new Activity(0,6);
		arr[1]=new Activity(3,4);
		arr[2]=new Activity(1,2);
		arr[3]=new Activity(5,9);
		arr[4]=new Activity(5,7);
		arr[5]=new Activity(8,9);
		
		Activity sortedarr[]=sort(arr);
		System.out.println("Activities after sorting according to fininsh time ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i].start+" "+arr[i].finish);
		}
		
		PrintActivity(sortedarr);
		
	}

	
	
}
