package day1;
import java.util.Scanner;
public class evenodd {
	public static Scanner sc;
	public static void main(String [] args)
	{
		sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int a = sc.nextInt();

		if (a == 0 || a == 1) {
			System.out.println(a + "   is Neither Even nor Odd");
		}

		if (a >= 2) {
			if (a % 2 == 0) {
				System.out.println(a + "   is an Even Number");
			} else {
				System.out.println(a + "   is an Odd Number");
			}
		}
	}
}
