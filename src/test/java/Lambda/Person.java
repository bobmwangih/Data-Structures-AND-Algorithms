package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Person {

	public enum Gender{
		MALE,FEMALE
	}
	
	private String name;
	private String email;
	private int age;
	private Gender gender;

	public Person() {
		super();
	}
	
	
	
	public Person(String name, String email, int age, Gender gender) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", gender=" + gender + "]";
	}



	public void printPerson() {
		System.out.println(this.toString());
	}
	
	public static List<Person> generatePerson() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("BOB","bob@test.com",25,Gender.MALE));
		people.add(new Person("bTown","bTown@test.com",20,Gender.FEMALE));
		people.add(new Person("cTown","cTown@test.com",27,Gender.MALE));
		people.add(new Person("dTown","dTown@test.com",24,Gender.MALE));
		people.add(new Person("eTown","eTown@test.com",21,Gender.FEMALE));
		return people;
	}
	
	
}
