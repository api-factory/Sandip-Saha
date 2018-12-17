package day1;
import java.util.Scanner;
public class armstrong {
	public static Scanner sc;
	public static void main(String [] args)
	{
		sc= new Scanner(System.in);
		System.out.println("Enter The Number");
		int a= sc.nextInt();
		
		int t=a, sum=0;
		while(t>0)
		{
			int rem= t%10;;
			sum+=(rem*rem*rem);
			t/=10;
		}
		if(sum==a)
		{
			System.out.println(a+"    is an Armstrong Number");
		}
	
		else
		{
		System.out.println(a+"     is not an Armstrong Number");
		}
	}
}