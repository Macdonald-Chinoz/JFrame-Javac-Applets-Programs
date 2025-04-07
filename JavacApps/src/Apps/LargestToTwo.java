package Apps;
import java.util.Scanner;

public class LargestToTwo {
	private static Scanner sc;
//write a program to find largest of two numbers
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("Please enter the first number:");
		int number1=sc.nextInt();
		
		System.out.println("Please enter the second number:");
		int number2=sc.nextInt();
		
		if (number1 > number2)
		{
			System.out.println("\n the largest number=" + number1);
		}
		else if (number2> number1)
		{
			System.out.println("\n the largets number=" + number2);
		}
		else
		{
			System.out.println("\n Both are equal");
		}
	}
}
