package lambdatraining.datetime;

import java.util.HashMap;
import java.util.Map;

public class CollectionsTrainingFour {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("david", 21);
		Employee e2 = new Employee("david", 21);
		Employee e3 = new Employee("david", 21);
		Employee e4 = new Employee("david", 24);
		Employee e5 = new Employee("sum", 50);
		
		Map<String, Employee> em = new HashMap<>();
		em.put("a", e1);
		em.put("b", e2);
		em.put("c", e3);
		em.put("d", e4);
		em.put("e", e5);

		Map<Employee, String> emtest = new HashMap<>();
		emtest.put(e1, "1");
		emtest.put(e2, "2");
		emtest.put(e3, "3");
		emtest.put(e4, "4");
		emtest.put(e5, "5");
		
		System.out.println(em);
		System.out.println(emtest);
		
	}
	
	
	private static class Employee{
		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + "]";
		}
		String name;
		Integer age;
		
		
		
		@Override
		public int hashCode() {
			return 1;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (age == null) {
				if (other.age != null)
					return false;
			} else if (!age.equals(other.age))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		private Employee() {}
		
		
		public Employee(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		
	}
}
