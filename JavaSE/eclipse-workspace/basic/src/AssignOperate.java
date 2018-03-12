/*
 * Problem:
 * 赋值运算符
 * "=" 和 "+=" 的区别 
 */

public class AssignOperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s = 3;
		short x = 3;
		s += 4;
		//x = x + 4;
		System.out.println("s=" + s + ", x=" + x);
	}

}
/*
 * Problem：
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from int to short
 * 看起来应该s=x=7，但是语句"x = x + 4;"却不能编译通过
 * s += 4; 和 x = x + 4; 有什么不同？
 * Solution：
 * 因为在"s += 4;"一次运算，暗藏自动转换过程
 * 而"x = x + 4;"两次运算，右边的x是变量，是不确定值，所以可能出现精度丢失，编译器就不予通过
 * Tips：
 * "s += 4;" = "s = (short)(s + 4);"
 */