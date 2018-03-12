import java.util.Arrays;

public class ArraystoString_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] luckyNumbers = {2, 3, 5, 7, 11, 13 };
		System.out.println(luckyNumbers);
		String s = "" + luckyNumbers;
		System.out.println(s);
		s = Arrays.toString(luckyNumbers);
		System.out.println(s);
		s = "[2, 3, 5, 7, 11, 13]";
		System.out.println(s);
	}

}
