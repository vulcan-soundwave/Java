package reflection;

import java.lang.reflect.Modifier;
import java.util.Scanner;

import javax.xml.bind.PrintConversionEvent;

/**
 * This program uses reflection to print all features of a class
 * @version 1.1 2017-11-26 Sun.
 * @author soundwave
 *
 */
public class ReflectionTest {

	public static void main(String[] args) {
		
		// read class name from command line args or user input
		String name;
		if (args.length > 0) name = args[0];
		else {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter class name (e.g. java.util.Date):");
			name = in.next();
		}
		
		try {
			// print class name and superclass name (if != Object)
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0) System.out.println(modifiers + "");
			System.out.println("class " + name);
			if (supercl!=null && supercl!=Object.class) System.out.println(" extends "+supercl.getName());
			
			System.out.println("\n{\n");
			printConstructors(cl);
			System.out.println();
			printMethods(cl);
		}
		
	}

}
