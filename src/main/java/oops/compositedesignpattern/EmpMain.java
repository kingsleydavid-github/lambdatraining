package oops.compositedesignpattern;

public class EmpMain {

	public static void main(String[] args) {
		
		Dev d1 = new Dev("dev1", 4);
		Dev d2 = new Dev("dev2", 5);
		Dev d3 = new Dev("dev3", 6);
		
		Dev d4 = new Dev("dev4", 7);
		Dev d5 = new Dev("dev5", 8);
		Dev d6 = new Dev("dev6", 9);
		
		LeadDeveloper  l1 = new LeadDeveloper("LD1", 2);
		LeadDeveloper  l2 = new LeadDeveloper("LD2", 3);

		l1.addDeveloper(d1);
		l1.addDeveloper(d2);
		l1.addDeveloper(d3);
		
		l2.addDeveloper(d4);
		l2.addDeveloper(d5);
		l2.addDeveloper(d6);
		
		Manager manager = new Manager("david", 1);
		manager.addDevLead(l1);
		manager.addDevLead(l2);
		
		manager.getEmpDetails();
	}
	
}
