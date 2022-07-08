package recursion;

import java.util.ArrayList;
import java.util.List;

public class JosephProblem_recursion_anuj {

	public static int josephProblem(int n,int k)
	{
		if(n==1) return 0;
		
		return (josephProblem(n-1,k)+3)%n;
	}
	
	
	public static void main(String[] args) {
		 System.out.println(josephProblem(5,3));
	}
}
