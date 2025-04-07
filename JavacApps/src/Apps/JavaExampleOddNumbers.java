package Apps;

public class JavaExampleOddNumbers {
//Display all even and odd numbers from 1 to 100
	public static void main(String[] args) {
		int n=100;
		System.out.println("Odd numbers from 1 to"+n+"are:");
		for(int i=1;i<=n;i++)
		{
			if (i% 2!= 0)
			{
				System.out.println(i+"");
			}
		}
	}
}
