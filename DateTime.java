import java.time.*;
import java.util.*;
import java.time.format.*;

public class DateTime
{
	public static String getDay(String day,String month,String year)throws Exception
	{
		int d=Integer.valueOf(day);
		int m=Integer.valueOf(month);
		int y=Integer.valueOf(year);
		LocalDate date=LocalDate.of(d,m,y);
		return date.getDayOfWeek().toString();
	}
	public static void main(String args[])
	{
		try
		{
			Scanner s1=new Scanner(System.in);
			String day=s1.next();
			String month=s1.next();
			String year=s1.next();
			System.out.println(getDay(day,month,year));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

