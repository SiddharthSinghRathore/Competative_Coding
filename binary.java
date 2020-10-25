import java.util.*;
public class binary{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        int result=0;
        while(n!=0)
            {
            if(n%2==1)
                {
               count++;
               result=fun(count,result);
            }
            else
                {
               result=fun(count,result);
                count=0;
            }
            n=n/2;
        }
        System.out.println(result);       
}
    public static int fun(int a,int b)
        {
        if(b<a)
          b=a;
        return b;
    }
}
