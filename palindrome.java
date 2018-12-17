package day1;
import java.util.Scanner;
public class palindrome {
	
	public static Scanner sc;
	public static void main(String [] args)
	{
		sc= new Scanner(System.in);
		System.out.println("Enter The Number");
		int a= sc.nextInt();
		
		int t=a, sum=0;
		while(t>0)
		{
			int rem= t%10;
			sum=(sum*10)+rem;
			t/=10;
		}
		if(sum==a)
		{
			System.out.println(a+"   is an Plaindrome Number");
		}
		else
		{
			System.out.println(a+"   is not an Plaindrome Number");
		}
	}

}
