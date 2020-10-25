/*
Count of subarrays having sum equal to its length
Input: N = 3, arr[] = {1, 0, 2}
Output: 3
Explanation:
Total number of subarrays are 6 i.e., {1}, {0}, {2}, {1, 0}, {0, 2}, {1, 0, 2}.
Out of 6 only three subarrays have the number of elements equals to sum of its elements i.e., 
1) {1}, sum = 1, length = 1.
2) {0, 2}, sum = 2, length = 2.
3) {1, 0, 2}, sum = 3, length = 3.

Input: N = 3, arr[] = {1, 1, 0}
Output: 3
Explanation:
Total number of subarrays are 6 i.e. {1}, {1}, {0}, {1, 1}, {1, 0}, {1, 1, 0}.
Out of 6 only three subarrays have the number of elements equals to sum of its elements i.e., 
1) {1}, sum = 1, length = 1.
2) {1}, sum = 1, length = 1.
3) {1, 1}, sum = 2, length = 2.
*/
import java.util.*;
public class CountSubArray
{
	public static void countsum(int a[],int no)
	{
		int i=0;
		int ans=0;
		for(i=0;i<no;i++)
			a[i]--;
		int []pref=new int[no];
		pref[0]=a[0];
		for(i=1;i<no;i++)
			pref[i]=pref[i-1]+a[i];
		HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();
		mp.put(0,1);
		for(i=0;i<no;i++)
		{
			if(mp.containsKey(pref[i]))
			{
				ans+=mp.get(pref[i]);
				mp.put(pref[i],mp.get(pref[i])+1);
			}
			else
			{
				mp.put(pref[i],1);
			}
		}
		System.out.println(""+ans);
	}
	public static void main(String args[])
	{
		int no=0,i=0;
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the array Limits");
		no=ss.nextInt();
		int a[]=new int[no];
		for(i=0;i<a.length;i++)
		{
			a[i]=ss.nextInt();
		}
		countsum(a,no);
	}
}




















