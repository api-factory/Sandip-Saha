package day1;

import java.util.Scanner;

public class stringreverse {

	public static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Sentence");
		String s = sc.nextLine();

		String s1 = reverse(s);

		String[] s2 = s1.split(" ");
		String s3 = "";

		for (String x : s2) {
			StringBuffer buffer = new StringBuffer(x);
			buffer.reverse();
			if (s3.length() == 0 ) {
				s3 += buffer.toString()+" ";
			} else {
				s3 += buffer.toString();
			}
		}

		System.out.println("The reverse of the String is: " + s3);

	}

	public static String reverse(String s) {

		if (s.isEmpty())
			return s;

		return reverse(s.substring(1)) + s.charAt(0);
	}

}
