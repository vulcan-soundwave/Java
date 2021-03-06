/*
 问题：
 计算机中负数的存储与运算
 
 思路：
 在计算机中，负数以补码形式存储，以补码形式运算
 （其实所有数都是，只不过正数的补码和源码一样）
*/
/*
 unicode 码表 
*/


public class VarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 3;
		b = (byte)(b + 200);	//强制类型转换
		System.out.println(b);
	}
}

/*
小结：
输出结果为-53，精度丢失
为什么呢？
byte为一个字节，即八位(bit)，取值范围为-128～+127
200 + 3 = 203，在计算机中存储为 0000-0000 0000-0000 0000-0000 1100-1011
byte类型只取后八位 1100-1011，且只有后七位是数值，第一位是符号位，
计算机判定其为负数，对其-1再取反，保持符号位不变，得1011-0101=-53
一定要注意这个精度丢失的问题
 */