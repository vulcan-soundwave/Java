package equals;

public class Object_equalsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee staff = new Employee("Vulcan", 50000, 2007, 5, 18);
		Object obj = staff;
		if(staff == obj)
			System.out.println("\"==\"\tis true");
		else
			System.out.println("\"==\"\tis false");
		if(staff.equals(obj))
			System.out.println("\"equals()\"\tis true");
		else
			System.out.println("\"equals()\"\tis false");
			
			
	}

}
