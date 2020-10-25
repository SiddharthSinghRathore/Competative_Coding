//Java Program to right rotate the elements of an array

//hera By Default rotate 4 in right hand-side

/* Original Array:
1   2   3   4   5
Array after right rotation:
3   4   5   1   2 */

import java.util.*;

class RightRotate
{

	public static void rotate(int a[])
	{
		int rno=0,i=0,temp=0,j=0;
		Scanner ss1=new Scanner(System.in);
		System.out.println("Enter the No for right rotate");
		rno=ss1.nextInt();
		for(i=0;i<rno;i++)
		{
			temp=a[a.length-1];
			for(j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println();
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
		rotate(a);
	}
}
