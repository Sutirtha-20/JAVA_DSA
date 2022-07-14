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
		s = s.trim();
		String[] arr = s.split("\\s");
		String ans = "";
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i==0)
			{
				ans = ans + arr[i].trim();
				System.out.println(arr[i].trim());
			}
			else {
				ans = ans + arr[i].trim()+ " ";
				System.out.println(arr[i].trim());
			}
		}
		
//		System.out.println(ans);
//		String ans = "";
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			StringBuilder sb = new StringBuilder(arr[i]);
//			ans = ans + sb.reverse().toString() + " ";
//		}
//		
//		System.out.println(ans);
	}
	public static void main(String[] args) {
		String ex = "a good   example";
		reversewords(ex);
	}
}
