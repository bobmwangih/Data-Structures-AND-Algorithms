package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	
///   stream  = List.of("a","b","c").stream()
///	  stream  = Stream.of("a","b","c")
///	  stream  = Arrays.stream(name of the array)
	
	static List<Employee> employees = new ArrayList<>();
	static {
		employees.add(new Employee("Bob", "Streamer", 5000, List.of("LAmbda", "Streams")));
		employees.add(new Employee("Gitch", "Lamdaler", 4000, List.of("Art", "slik")));
		employees.add(new Employee("Dap", "Hubber", 19000, List.of("GH", "gits")));
	}

	public static void main(String[] args) {

//FOREACH
		// employees.stream().forEach(employee -> System.out.println(employee));

//MAP (to Set)
		Set<Employee> increasedSal = employees.stream().map(employee -> new Employee(employee.getFirstName(),
				employee.getLastName(), employee.getSalary() * 10, employee.getProjects())).collect(Collectors.toSet());

//filter
		List<Employee> increaseLessSalaries = employees.stream().filter(employee -> employee.getSalary() <= 5000)
				.map(employee -> new Employee(employee.getFirstName(), employee.getLastName(),
						employee.getSalary() * 10, employee.getProjects()))
				.collect(Collectors.toList());

		// System.out.println(increaseLessSalaries);

//filter ----findFirst
		Employee employeeIncreased = employees.stream().filter(employee -> employee.getSalary() <= 1000)
				.map(employee -> new Employee(employee.getFirstName(), employee.getLastName(),
						employee.getSalary() * 10, employee.getProjects()))
				.findFirst().orElse(null);

		// System.out.println(employeeIncreased);

//flatMap
		String projects = employees.stream().map(employee -> employee.getProjects())
				.flatMap(strings -> strings.stream()).collect(Collectors.joining(","));

		// System.out.println(projects);

//short circuit  ---skip() ---limit()
		List<Employee> skipLimit = employees.stream().skip(1).limit(2).collect(Collectors.toList());

		// System.out.println(skipLimit);

//Finite data
		// Stream.generate(Math::random).limit(10).forEach(value ->
		// System.out.println(Math.round(value * 1000)));

//sorting 
		List<Employee> sortedEmployee = employees.stream()
				.sorted((e1, e2) -> e1.getFirstName().compareToIgnoreCase(e2.getFirstName()))
				.collect(Collectors.toList());

		//System.out.println(sortedEmployee);

//Max -min
		Employee maxSalary = employees.stream().max(Comparator.comparing(Employee::getSalary))
				.orElseThrow(NoSuchElementException::new);

		System.out.println(maxSalary);
		
//reduce
		int totalSalary = employees.stream().map(employee -> employee.getSalary()).reduce(0, Integer::sum);
		
		System.out.println(totalSalary);
	}

}
