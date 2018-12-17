package day1;
import java.util.Scanner;
import java.util.Arrays;
public class largestelementarray {

	public static Scanner sc;
	public static void main(String [] args)
	{
		sc= new Scanner(System.in);
		System.out.println("Enter The size of the Array");
		int x= sc.nextInt();
		
		
		
		System.out.println("Enter The lements of the array");
		
		int []a= new int[x];
	/*	a[0]=10;
		a[1]=12;
		a[2]=15;
		a[3]=17;
		a[4]=19;*/
		/*try
		{
		System.out.println(a[5]);
		}*/
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		/*catch(Exception e)
		{
			e.toString();
			System.out.println(e);
		}*/
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The Largest Element of the Array is: "+ a[a.length-1]);
			break;
		}
	}
}
