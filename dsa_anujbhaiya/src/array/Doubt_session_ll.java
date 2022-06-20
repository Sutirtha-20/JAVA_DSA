package array;

public class Doubt_session_ll {

	public static int majorityelement(int[] a)
	{
		int currelem = 0;
		int count = 0;
		for(int i =0;i<a.length;i++)
		{
			if(count==0)
			{
				currelem = a[i];
				count=1;
			}
			else {
				if(a[i]==currelem)
					count++;
				else
					count--;
				}
		}
		
		int finalcount = 0;
		for(int i:a)
			if(i==currelem)
				finalcount++;
		
		if(finalcount>a.length/2)
			return currelem;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		
	}
}
