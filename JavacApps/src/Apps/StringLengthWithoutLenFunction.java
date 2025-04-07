package Apps;

public class StringLengthWithoutLenFunction {
//write a program to find the length of the string without using len function
	public static void main(String[] args) {
		String str="Java Programming Guide";
		int i=0;
		for(char c:str.toCharArray()) {
			i++;
		}
		System.out.println("Length of the given string"+i);
	}

}
