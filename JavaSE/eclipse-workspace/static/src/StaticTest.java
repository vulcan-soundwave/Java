/*
 * This program demonstrates static methods;
 * @version 1.8 2017-11-05 Sun.
 * @author:Vulcan
 */
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Vulcan", 50000);
		staff[1] = new Employee("Harry", 40000);
		staff[2] = new Employee("Billy", 60000);
		
		// print put information about all Employee objects
		for(Employee e:staff) {
			e.setId();
			System.out.println("name="+e.getName()+", id="+e.getId()
									+", salary="+e.getSalary());
		}
		
		int n = Employee.getNextId();		// calls static field
		System.out.println("Next available id="+n);
	}

}
