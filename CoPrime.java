import java.util.*;

public class CoPrime
{
	static public void main(String args[])
	{
		int no1=0,no2=0;
		int i,hcf=0;
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the First No");
		no1=ss.nextInt();
		System.out.println("Enter the Second  No");
		no2=ss.nextInt();
		for(i=1;i<=no1;i++)
		{
			if(no1%i==0 && no2%i==0)
			{
				hcf=i;
			}
		}
		if(hcf==1)
		{
			System.out.println("Both Number are Co-Prime::");
		}
		else
		{
			System.out.println("Both Number are NOT Co-Prime::");
		}

	}
}
