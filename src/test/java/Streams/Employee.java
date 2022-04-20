package Streams;

import java.util.List;

public class Employee {

	private String firstName;
	private String lastName;
	private int salary;
	private List<String> projects;
	
	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, int salary, List<String> projects) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.projects = projects;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", projects="
				+ projects + "]";
	}
	
	
}
