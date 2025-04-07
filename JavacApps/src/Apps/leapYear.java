package Apps;

import java.util.Scanner;

public class leapYear {
//write a program to check whether a year is a leap year or not 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year");
		int year=sc.nextInt();
		
		if((year%4==0)||(year%4==0&&year%100==0))
		{
			System.out.println(year+"is leap year");
		}
		else
		{
			System.out.println(year+"is not leap year");
		}
	}

}
