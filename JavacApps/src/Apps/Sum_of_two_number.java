package Apps;

import java.util.Scanner;

public class Sum_of_two_number {
//write a program to enter two numbers and perfor sum of two numbers using input
	public static void main(String[] args) {
		int sum;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your first number=");
		int First_number=s.nextInt();
		System.out.println("Enter your second number");
		int Second_number=s.nextInt();
		sum=First_number+Second_number;
		System.out.println("sum of two number "+First_number+"+"+Second_number+"="+sum);
	}
}
