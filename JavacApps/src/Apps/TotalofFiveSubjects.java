package Apps;

import java.util.Scanner;

//Enter the five subjects marks
public class TotalofFiveSubjects {
private static Scanner sc;
	
public static void main(String[] args) {
		int english,chemistry,computers,physics,maths;
		float total,percentage,average;
		sc=new Scanner(System.in);
		
		System.out.println("Please enter the five subject marks:");
		english=sc.nextInt();
		chemistry=sc.nextInt();
		computers=sc.nextInt();
		physics=sc.nextInt();
		maths=sc.nextInt();
		
		total=english+chemistry+computers+physics+maths;
		average=total/5;
		percentage=(total/500)*100;
		
		System.out.println("Total Marks= "+total);
		System.out.println("Average Marks= "+average);
		System.out.println("Marks Percentage= "+percentage);
	}

}
