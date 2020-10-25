import java.util.*;

public class Reverse
{
	public static void main(String args[])
	{
	        Scanner sc=new Scanner(System.in);
        	String A=sc.next();
		String reverse="";
	        /* Enter your code here. Print output to STDOUT. */
		int length=A.length();

		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+A.charAt(i);
		}
		System.out.println(""+reverse);
    	}
}
