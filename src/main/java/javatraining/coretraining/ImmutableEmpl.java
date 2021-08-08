package javatraining.coretraining;

import java.util.HashMap;
import java.util.Map;

//S1: declare class as final
public final class ImmutableEmpl {

	//S2: data members declared as private 
	//S3: data members declared as final
	private final String name;
	private final Integer age;
	private final HashMap<String,String> empProps;
	
	
	/*
	public ImmutableEmpl(String name, Integer  age, Map<String,String> props) {
		this.name = name;
		this.age  = age;
		this.empProps = (HashMap<String, String>) props;
	}
	*/
	
	
	//S4: deep copy constructor
	public ImmutableEmpl(String name, Integer  age, Map<String,String> props) {
		this.name = name;
		this.age  = age;
		this.empProps = new HashMap<String,String>();
		props.entrySet().stream().forEach((entry) -> {
			String key = entry.getKey();
			String val = entry.getValue();
			this.empProps.put(key, val);
		});
	}
	
	//S5: declare only getters fr the variables
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public HashMap<String, String> getEmpProps() {
		
		//S6: clone in get method
		return (HashMap<String, String>) this.empProps.clone();
	}
}
