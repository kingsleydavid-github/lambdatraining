package javatraining.coretraining;

import java.util.HashMap;
import java.util.Map;

public class ImmutableExeMain {

	public static void main(String[] args) {
		
		
		String name = "David";
		Integer age = 54;
		Map<String, String> map = new HashMap<>();
		map.put("test1", "val1");
		map.put("test2", "val2");
		map.put("test3", "val3");
		
		ImmutableEmpl cls = new ImmutableEmpl(name, age, map);
		
		System.out.println(name == cls.getName());
		System.out.println(age == cls.getAge());
		
		System.out.println("cls name:"+cls.getName());
		System.out.println("cls age:"+cls.getAge());
		System.out.println("cls testMap:"+cls.getEmpProps() );
		
		age =  45;
		name =  "Ram";
		map.put("test4", "val4");

		System.out.println("cls name after update:"+cls.getName());
		System.out.println("cls age after update:"+cls.getAge());
		System.out.println("cls testMap after update 1:"+cls.getEmpProps() );
		
		Map<String, String> mapDemo = cls.getEmpProps();
		mapDemo.put("test5", "val5");

		System.out.println("cls testMap after update 2:"+cls.getEmpProps() );
	}

}
