package Apps;

import java.util.Scanner;

public class PrintEveryCharacters {
//write a program to print every character of a string entered by user in a new line using a loop
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string....");
		String str=sc.nextLine();
		System.out.println("Characters in"+str+" are:");
		
		for (int i=0;i<str.length();i++) 
		{
			char a=str.charAt(i);
			System.out.println(a+", ");
		}
	}

}
