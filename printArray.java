package day1;
import java.util.Scanner;
public class printArray {

	public static Scanner sc;
	public static void main(String [] args)
	{
		sc= new Scanner(System.in);
		System.out.println("Enter The size of the Array");
		int x= sc.nextInt();
		
		
		System.out.println("Enter The lements of the array");
		
		int []a= new int[x];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The "+ (i+1) +" Position Element of the Array is:  "+a[i]);
		}
	}
}
