package com.dilip.dayThreeCodes.hirerachialInheritance;

public class Employee extends Person {

	private int empId;
	private String Organization;
	private String designation;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getOrganization() {
		return Organization;
	}

	public void setOrganization(String organization) {
		Organization = organization;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee(String name, int age, String nationality, String state, String city, String gender, int empId,
			String organization, String designation) {
		super(name, age, nationality, state, city, gender);
		this.empId = empId;
		Organization = organization;
		this.designation = designation;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("This is an Employee!");
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Organization=" + Organization + ", designation=" + designation
				+ ", toString()=" + super.toString() + "]";
	}
	
}
