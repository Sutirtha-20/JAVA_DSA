package recursion;

public class Recursion_ll_anuj {
	
	public static int sumofnumbers(int n)
	{
		if(n/10==0)
		{
			return n;
		}
		return (n%10)+sumofnumbers(n/10);
	}
	
	public static void generateallsubsets(String s)
	{
		generateallsubsetshelper(s,0,"");
	}
	
	public static void generateallsubsetshelper(String s,int index,String curr)
	{
		int n = s.length();
		if(index>=n) 
		{
			System.out.println(curr);
			return;
		}
		generateallsubsetshelper(s,index+1,curr);
		generateallsubsetshelper(s,index+1,curr+s.charAt(index));
	}
	public static void main(String[] args) {
//		System.out.println(sumofnumbers(213));
		generateallsubsets("abc");
	}
}
