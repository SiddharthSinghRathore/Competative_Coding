import java.util.*;
public class RemoveDuplicate
{
	public static void main(String args[])
	{
		int no=0,i=0,j=0;
//		int b[]=new int[no];
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the Limit of array");
		no=ss.nextInt();
		int a[]=new int[no];

		for(i=0;i<no;i++)
		{
			a[i]=ss.nextInt();
		}

		for(i=0;i<a.length;i++)
		{
			if(a[i]==a[i+1])
			{
				for(j=i;j<no;j++)
					a[j]=a[j+1];
				i--;
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(""+a[i]);
		}
	}
}
