package Apps;

import java.util.Scanner;

public class JavaExample {
//Write a program to enter P,T,and R and calculate Simple Interest
	public static void main(String[] args) {
		float p,r,t,sInterest;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Principal:");
		p=scan.nextFloat();
		System.out.println("Enter the Rate of interest");
		r=scan.nextFloat();
		System.out.println("Enter the Time period");
		t=scan.nextFloat();
		scan.close();
		sInterest=(p*r*t)/100;
		System.out.println("Simple Interest is:"+sInterest);
	}
}
