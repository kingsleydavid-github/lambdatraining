package oops.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class LeadDeveloper implements Employee {

	private String empName;
	private Integer empId;
	private List<Employee> devList = new ArrayList<Employee>();

	public LeadDeveloper(String empName, Integer empId) {
		this.empName = empName;
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void getDevList() {
		devList.stream().forEach(i->{
			i.getEmpDetails();
		});
	}

	public void addDeveloper(Employee dev) {
		this.devList.add(dev);
		System.out.println("Developer Added Successfully");
	}

	public void removeDeveloper(Employee dev) {
		this.devList.remove(dev);
		System.out.println("Developer Removed Successfully");
	}

	@Override
	public void getEmpDetails() {
		System.out.println(this.getEmpName() + " " + this.getEmpId());
		System.out.println("Devs Under this Lead Developer :: ");
		this.getDevList();
	}
}
