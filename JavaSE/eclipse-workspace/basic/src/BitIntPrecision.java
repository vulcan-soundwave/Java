/* 
 * 问题：
 * byte 和 int 的精度(precision)问题
 */

public class BitIntPrecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		byte b = 4;
		byte b1 = 3;
		byte b2 = 7;
		b = b1 + b2;
		System.out.println(b);
		*/
		int x = 4;
		int x1 = 3;
		int x2 = 7;
		x = x1 + x2;
		System.out.println(x);
		
	}
}
/*
 * Problem_1：
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from int to byte
 * 告诉我们类型不匹配，存在一个精度丢失问题
 * Sulotion：
 * 看似没什么问题，但是我们要注意，byte b=4；中的4是int类型，但是在赋值过程中强制转换成byte型了；
 * 	但是byte b=4；的4是常量，而b=b1+b2；的b1和b2是变量，是有可能计算后得到超出byte表示范围的值的，所以编译出错。
 * 意思是byte是 8 位的，而int 是 32 位的
 * 
 * Problem_2：
 * 但是同样的情况在 int 类型下却可以编译成功。
 * 为什么呢？
 * 因为整数默认类型就是 int 类型，整数的运算结果也自然是整数（int）类型，所以能编译
 * 也会存在超出其表示范围的情况，这种情况下，只保留32位，意味着最高位为1，为负数
 * 
 */