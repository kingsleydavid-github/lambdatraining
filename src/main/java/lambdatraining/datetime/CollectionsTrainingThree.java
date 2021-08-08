package lambdatraining.datetime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsTrainingThree {

	public static void main(String[] args) {

		Map<String, String> hm1 = new HashMap<>();
		List<Employee> al1 = new ArrayList<>();
		
		Employee e1 = new Employee(2, "India");
		Employee e2 = new Employee(4, "India");
		Employee e3 = new Employee(5, "India");
		Employee e4 = new Employee(5, "Layman");
		Employee e5 = new Employee(6, "Jim");
		
		
		
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		al1.add(e4);
		al1.add(e5);
		
		System.out.println(al1);
		Predicate<Employee> p1 = (emp) -> emp.getName().equalsIgnoreCase("Jim");
		System.out.println(al1.stream().min(new EmployeeComparator()).get());
		System.out.println(al1.stream().max(new EmployeeComparator()).get());
		
		System.out.println(al1.stream().collect(Collectors.groupingBy(Employee::getName)));;
		

	}

	private static class Employee {
		Integer empid;
		String name;

		public Integer getEmpid() {
			return empid;
		}

		public void setEmpid(Integer empid) {
			this.empid = empid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Employee(Integer empid, String name) {
			super();
			this.empid = empid;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", name=" + name + "]";
		}
		
		

	}
	
	private static class EmployeeComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.empid.compareTo(o2.empid);
		}
		
	}
}
