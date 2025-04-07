package Apps;

public class SwapTwoNumbersWithoutTempVariable {
	//How to swap numbers without using a temporary variable
	public static void main(String[] args) {
		int x=10;
		int y=5;
		System.out.println("Before Swapping:"+"x= "+"y= "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swaping:"+"x= "+x+"y= "+y);
	}
}
