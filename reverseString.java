package week1.day3;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="Welcome";	
		int	l = input.length();

		char[] r= input.toCharArray();


		for (int i = l-1;i >= 0; i--) 
		{
			System.out.print(r[i]);
		}
	}

}
