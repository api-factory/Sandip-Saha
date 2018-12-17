package PuneLp;
import java. util.Scanner;
public class PalindromeUsingMethod {

	public static Scanner sc;
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The String");
		String s= sc.nextLine();
		try
		{
		String s2=palindrome(s);
		if(s2.equals(s))
		{
			System.out.println((Integer.parseInt(s)+" is an Palindrome Number"));
		}
		else
		{
			System.out.println((Integer.parseInt(s)+" is not an Palindrome Number"));
		}
		}
		catch(Exception e)
		{
			e.toString();
		}
	}
	public static String palindrome(String s)
	{
		int sum=0;
		String s1="";
		char[]a= new char[s.length()];
		for(int i=0; i<a.length;i++)
		{
			a[i]=s.charAt(i);
		}
		char[]b= new char[a.length];
		for(int i=0; i<a.length;i++)
		{
			if(Character.isDigit(a[i]))
			{
				b[i]+=a[i];
			}
			else
			{
				System.out.println("Please Enter Valid Number");
				break;
			}
		}
		
		for(int i=b.length-1; i>=0;i--)
		{
			s1+=b[i];
		}
		
		
		return s1;
	}
}
