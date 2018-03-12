/*
 * Request:
 * 获取三个整数中最大的整数
 * Thinking:
 * 三元运算符
 */


public class TernaryOperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		int c = 5;
		System.out.println("a="+a+", b="+b+", c="+c);
		
		b = (a>b?a:b)>c?(a>b?a:b):c;
		System.out.println(b);
	}

}
/*
 * Tips：
 * 还是把 "b = (a>b?a:b)>c?(a>b?a:b):c;" 拆成两个三元运算符更好
 */