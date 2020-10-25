import java.io.*;
import java.util.*;

public class SplitToken
{


 public static void main(String[] args) 
{
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Write your code here.
       // String[] tokens = s.trim().split("[!,?.*_'@\\ ]+");
   String[] tokens = s.trim().split("\\s");
        int size = tokens.length;
        System.out.println(size);
        for(int i=0; i<size; i++)
	{
            System.out.println(tokens[i]);        
		scan.close();
    	}
}
}

