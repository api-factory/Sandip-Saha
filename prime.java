package day1;
import java.util.Scanner;
public class prime {

	public static Scanner sc;
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter The Number");
		 int x= sc.nextInt();
		 int flag=0;
		 
		 if(x==0||x==1)
		 {
			 System.out.println(x+ "is not Prime Number");
		 }
		 else
		 {
			 for(int i=2;i<=x/2;i++)
			 {
				 if(x%i==0)
				 {
					 flag=1;
					 break;
				 }
			 }
			 
			 if(flag==0)
			 {
				 System.out.println(x+"  is a Prime Number");
			 }
			 else
			 {
				 System.out.println(x+"  is not a Prime Number");
			 }
		 }
		
	}
}
