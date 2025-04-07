package Apps;

import java.util.Scanner;

public class Demo {
//write a program to perform arithmetic operations on two numbers
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two integer values:\n");
		
		//reading data using readLine
		int p=in.nextInt();
		int q=in.nextInt();
		int sum,sub,mul,mod;
		float div;
		
		sum=p+q;
		sub=p-q;
		mul=p*q;
		div=p/q;
		mod=p%q;
		
		System.out.println("\n");
		System.out.println("SUM: "+p+"+"+q+"="+sum+"\n");
		System.out.println("DIFFERENCE: "+p+"-"+q+"="+sub+"\n");
		System.out.println("PRODUCT: "+p+"*"+q+"="+mul+"\n");
		System.out.println("QUOTIENT: "+p+"/"+q+"="+div+"\n");
		System.out.println("MODULUS: "+p+"%"+q+"="+mod+"\n");
	}
}
