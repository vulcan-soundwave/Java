package equals;

public class Object_equalsTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		// 2
		int n=3;
		int m=3;
    
		System.out.println(n==m);
    
		String str = new String("hello");
		str1 = new String("hello");
    	str2 = new String("hello");
    
    	System.out.println(str1==str2);
    
    	str1 = str;
    	str2 = str;
    	System.out.println(str1==str2);
	}

}
