package equals;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public LocalDate getHireDay() {
		return this.hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public boolean equals(Object otherObject) {
		// a quick test to see if the objects are indentical
		if (this == otherObject)	return true;
		
		// must return false if the explicit paramenter is null
		if (otherObject == null) return false;
		
		// if the classes do not match, they are not be equal
		if (getClass() != otherObject.getClass()) return false;
		
		// now we know otherObject is a non-null Employee
		Employee other = (Employee)otherObject;
		
		// test whether the fields have identical values
		return Objects.equals(name, other.name) && salary==other.salary 
				&& Objects.equals(hireDay, other.hireDay);
	}
	
	public int hashCode() {
		return Objects.hash(name, salary, hireDay);
	}
	
	public String toString() {
		return getClass().getName()+"[name="+name+",salary="+salary+", "
				+ "hireDay="+hireDay+"]"; 
	}

}

