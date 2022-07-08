package recursion;

public class Doubt_session_Anuj {
	
	public static int rodCutting(int n,int a,int b,int c)
	{
		//base case
		if(n==0) return 0;
		if(n<0) return -1;
		
		int cutA = rodCutting(n-a,a,b,c);
		int cutB = rodCutting(n-b,a,b,c);
		int cutC = rodCutting(n-c,a,b,c);
		
		int res = Math.max(cutA, Math.max(cutB, cutC));
		if(res == -1) return -1;
		else return res+1;
	}
	
	public static void main(String[] args) {
		int n = 17;
		int a = 10;
		int b = 11;
		int c = 3;
		System.out.println(rodCutting(n, a, b, c));
	}
}
