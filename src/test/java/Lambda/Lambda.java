package Lambda;

import java.util.List;
import java.util.function.Predicate;

public class Lambda {

	/*
	 * static void peopleAboveAges(List<Person> people,int age) { for(Person p :
	 * people) { if(p.getAge() >= age ) { //System.out.println(age);
	 * p.printPerson(); } } }
	 */

	static void printPeople(List<Person> people, CheckPerson checker) {
		for (Person p : people) {
			if (checker.isToBePrinted(p)) {
				p.printPerson();
			}
		}
	}
//with java Predicate, no tester Interface	
	static void printPeopleWithPredicate(List<Person> people, Predicate<Person> checker) {
		for (Person p : people) {
			if (checker.test(p)) {
				p.printPerson();
			}
		}
	}

	public static void main(String[] args) {
		List<Person> people = Person.generatePerson();
		// peopleAboveAges(people, 21);

//Without Lambda		
		/*
		 * printPeople(people, new CheckPerson() {
		 * 
		 * @Override public boolean isToBePrinted(Person p) { return p.getAge() >= 18 &&
		 * p.getAge() <= 27 && Person.Gender.FEMALE == p.getGender(); } });
		 */

//With Lambda		
		/*printPeople(people, (Person p) -> {
			return p.getAge() >= 21 && p.getAge() <= 27 && Person.Gender.FEMALE == p.getGender();
		});*/
		
// With Lambda refactored
		//printPeople(people, p -> p.getAge() >= 20 && p.getAge() <= 27 && Person.Gender.FEMALE == p.getGender());
		
// With predicate
		printPeopleWithPredicate(people, p -> p.getAge() >= 20 && p.getAge() <= 27 && Person.Gender.FEMALE == p.getGender());
	}
	

	

}
