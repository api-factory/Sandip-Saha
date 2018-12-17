package day1;
import java.util.Scanner;
public class removewhitespaces {

	public static Scanner sc;
	public static void main( String [] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The String");
		String a= sc.nextLine();
		String []b=a.split(" ");
		String c="";
		
		for(String x:b)
		{
			c+=x;
		}
		
		System.out.println("After removing the whitespaces:"+ c);
	}
}
