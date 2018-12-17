package day1;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class stringtodate {

	public static Scanner sc;
	public static void main(String [] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The String");
		String s= sc.nextLine();
		try
		{
		Date date1= new SimpleDateFormat("dd-mm-yyyy").parse(s);
		System.out.println(date1);
		}
		catch(Exception e)
		{
			e.toString();
		}
		
		}
	}

