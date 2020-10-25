import java.util.*;
public class Replace
{
	public static void encryptarray(int a[],int length)
	{
		int i=0,sum=0;
		for(i=0;i<length;i++)
			sum=sum+a[i];
		for(i=0;i<length;i++)
			System.out.print(sum-a[i]+"  ");
	}
	public static void main(String args[])
	{
		int no=0,i=0;
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		no=ss.nextInt();
		int a[]=new int [no];
		for(i=0;i<no;i++)
		{
			a[i]=ss.nextInt();
		}
		int length=a.length;
		System.out.println("Length"+length);
		encryptarray(a,length);
		

	}
}
