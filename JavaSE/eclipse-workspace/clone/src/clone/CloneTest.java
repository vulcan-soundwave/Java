package clone;
/**
 * This program demonstrates cloning.
 * @version 1.8 2017-11-18 Sat.
 * @author soundwave
 * tips:
 * 另一种克隆对象的机制，其中使用了Java的对象串行化特性。
 * 这个机制很容易实现，而且很安全，但是效率不高。
 */
public class CloneTest {

	public static void main(String[] args) {

		try {
			Employee original = new Employee("John Q. Public", 50000);
			original.setHireDay(2000, 11, 18);
			Employee copy = original.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2018, 10, 7);
			System.out.println("original = " + original.toString());
			System.out.println("copy = " + copy.toString());
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
