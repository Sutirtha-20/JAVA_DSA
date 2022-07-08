package strings;

public class Strings_l_anujbhaiya {
	
	public static boolean isanagram(String s1,String s2)
	{
		int[] a = new int[256];
		
		for(int i=0;i<s1.length();i++)
		{
			a[s1.charAt(i)]++;
		}
		
		for(int i=0;i<s2.length();i++)
		{
			a[s2.charAt(i)]--;
		}
		
		for(int e:a)
			if(e!=0) return false;
		
		return true;
	}
	
	public static void reversewords(String s)
	{
//		char[] arr = s.toCharArray();
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			StringBuilder sb = new StringBuilder(arr[i]);
			sb.reverse();
			arr[i]=sb.toString();
		}
		String ans = "";
		for(int i=arr.length-1;i>=0;i--)
		{
			StringBuilder sb = new StringBuilder(arr[i]);
			ans = ans + sb.reverse().toString() + " ";
		}
		
		System.out.println(ans);
	}
	public static void main(String[] args) {
		String ex = "I am the boss";
		reversewords(ex);
	}
}
