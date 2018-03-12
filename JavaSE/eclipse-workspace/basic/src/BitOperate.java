/*
 * Request:
 * 对两个整数变量的值进行互换（不使用第三方变量）
 */

public class BitOperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		System.out.println("a="+a+", b="+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("1:\ta="+a+", b="+b);
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("2:\ta="+a+", b="+b);		
	}

}
