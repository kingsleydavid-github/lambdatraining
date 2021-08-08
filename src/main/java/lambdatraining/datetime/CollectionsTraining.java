package lambdatraining.datetime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import lambdatraining.models.Employee;

public class CollectionsTraining {
	
	public static void main(String[] args) {
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("David", 22));
		emps.add(new Employee("David", 28));
		emps.add(new Employee("David", 48));
		emps.add(new Employee("Leona", 20));
		emps.add(new Employee("Leona", 23));
		emps.add(new Employee("Leona", 40));
		emps.add(new Employee("Ram", 20));
		emps.add(new Employee("Ravi", 25));
		emps.add(new Employee("Sam", 22));
		emps.add(new Employee("Sam", 24));
		emps.add(new Employee("Sam", 28));
		emps.add(new Employee("Mark", 50));
		emps.add(new Employee("Tim", 60));
//		trainingMethod1(emps);
		
		
		// Filter all age by 20
		Predicate<Employee> isAge20 = (emp) -> emp.getAge() == 20;
		System.out.println("Filter all age by 20 :: " + emps.stream().filter(isAge20).collect(Collectors.toList()));
		
		System.out.println(emps.stream().collect(Collectors.groupingBy(Employee::getName)));
		
		System.out.println(
					emps.stream().collect( Collectors.groupingBy(Employee::getName, Collectors.mapping(Employee::getAge, Collectors.toSet())) ) 
				);
		
		AtomicInteger count = new AtomicInteger(0);
		System.out.println(emps.stream().collect(Collectors.groupingBy(item -> count.getAndIncrement() / 4 ) ).entrySet().stream().map(Map.Entry::getValue) );
		
		
		
		
		Hashtable<String, String> ht1 = new Hashtable<>();
		
		
	}

	private static void trainingMethod1(List<Employee> emps) {
		System.out.println("All Employees :: " + emps.size());
		
		Predicate<Employee> empAgeGreaterThan20 = (emp) -> emp.getAge() > 20;
		Predicate<Employee> empNameLeona = (emp) -> emp.getName().equalsIgnoreCase("Leona") ;
		Function<Employee, String> fnEmpNameGet = (emp) -> emp.getName();
		Supplier<Map<String, Set<Integer>>> supp = () -> new HashMap<String, Set<Integer>>();
		
		
		System.out.println("All Emps above 20 :: "+ emps.stream().filter(empAgeGreaterThan20).collect(Collectors.toList()));
		System.out.println("All Emps above 20 count :: "+ emps.stream().filter(empAgeGreaterThan20).count() );
		System.out.println("All Emps name Leona :: "+ emps.stream().filter(empNameLeona).collect(Collectors.toList()) );
		
		Map<String,List<Employee>> groupByNameEmp = new HashMap<>(); 
		Map<String, Set<Integer>> groupByNameEmpVar2 = new HashMap<>(); 
		groupByNameEmp = emps.stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println(emps.stream().collect(Collectors.groupingBy(Employee::getName, supp, Collectors.mapping(Employee::getAge, Collectors.toSet()))).entrySet());;
		System.out.println("All Emps name grouped by age:: "+groupByNameEmp);
		//System.out.println("All Emps name grouped and ages:: "+supp.);
	}

}
