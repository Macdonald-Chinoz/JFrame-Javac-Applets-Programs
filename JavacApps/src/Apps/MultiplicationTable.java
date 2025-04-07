package Apps;

import java.util.Scanner;

public class MultiplicationTable {
//Generate Multiplication Tale using for loop
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.....");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;++i)
		{
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
		
	}

}
