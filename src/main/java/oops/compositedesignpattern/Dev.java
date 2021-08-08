package oops.compositedesignpattern;

public class Dev implements Employee {

	private String empName;
	private Integer empId;

	
	public Dev(String empName, Integer empId) {
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

	@Override
	public void getEmpDetails() {
		System.out.println(this.getEmpId() + " " + this.getEmpName());

	}

}
