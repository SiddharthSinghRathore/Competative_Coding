import java.util.*;
public class BinaryConscutive
{
	public static void consutive(int a[])
	{
		int i=0;
		int maxcount=0,count=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				count+=1;
			}
			else
			{
				count=0;
			}
			maxcount=count>maxcount?count:maxcount;
		}
		System.out.println("Consutive:"+maxcount);
	}
	public static void main(String args[])
	{
		int no=0,i=0;
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the limit of array");
		no=ss.nextInt();
		int a[]=new int[no];
		for(i=0;i<no;i++)
		{
			a[i]=ss.nextInt();
		}
		consutive(a);
	}
}
