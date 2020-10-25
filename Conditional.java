public class Conditional
{
	public static void main(String args[])
	{
		int count=1;
		int maxcount=0;
		count++;

		maxcount=count>maxcount?count:maxcount;
		System.out.println("Consutive:"+maxcount);
	}

}
