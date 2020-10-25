/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int sum=0,first=0,last=0;
	    int no=0;
	    Scanner ss=new Scanner(System.in);
	    no=ss.nextInt();
	    first=no;
	    last=no%10;
	    while(first>=10)
	    {
	        first=first/10;
	    }
	    sum=last+first;
	    System.out.println(""+sum);
	    
	    
		// your code goes here
	}
}
