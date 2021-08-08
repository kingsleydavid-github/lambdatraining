package oops.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
	
	public Manager(String empName, Integer empId) {
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

	public void showDevLeadList() {
		devLeadList.stream().forEach(i->{
			i.getEmpDetails();
		});
	}

	public void addDevLead(Employee devLead) {
		this.devLeadList.add(devLead);
	}

	public void removeDevLead(Employee devLead) {
		this.devLeadList.remove(devLead);
	}

	private String empName;
	private Integer empId;
	private List<Employee> devLeadList = new ArrayList<>();

	@Override
	public void getEmpDetails() {
		System.out.println(this.getEmpName() + "  " + this.getEmpId());
		System.out.println("Devs Leads Under this Manager :: ");
		this.showDevLeadList();
	}

}
