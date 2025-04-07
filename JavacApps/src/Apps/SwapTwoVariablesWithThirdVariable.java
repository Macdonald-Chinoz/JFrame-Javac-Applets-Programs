package Apps;

import java.util.Scanner;

public class SwapTwoVariablesWithThirdVariable {
//swap values of two integer variables using third variable
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number...");
		int first=sc.nextInt();
		System.out.println("Enter second Number...");
		int second=sc.nextInt();
		
		System.out.println("--before swap--");
		System.out.println("First Number="+first);
		System.out.println("Second Number"+second);
		
		first=first-second;
		second=first+second;
		first=second-first;
		
		System.out.println("--after swap--");
		System.out.println("First Number="+first);
		System.out.println("Second Number"+second);
	}

}
