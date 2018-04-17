package common;

import java.util.Random;

public class GetPass {
	public static String get() {
		// TODO Auto-generated constructor stub
	    StringBuffer buffer = new StringBuffer("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"); 
	    StringBuffer sb = new StringBuffer(); 
	    Random random = new Random(); 
	    int range = buffer.length(); 
	    for (int i = 0; i < 32; i ++) { 
	        sb.append(buffer.charAt(random.nextInt(range))); 
	    } 
	    return sb.toString(); 	
	}

}
