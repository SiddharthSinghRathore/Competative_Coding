import java.util.*;

public class Loop1Hackerrank
{
	public static void main(String args[])
	{
		int no=0;
	        int i=1,result=0;
		Scanner s1=new Scanner(System.in);
	        int N = s1.nextInt();
		while(i<=10)
		{
			result=i*N;
			System.out.println(""+N+"*"+i+"="+result);
			i++;
		}

	}
}
