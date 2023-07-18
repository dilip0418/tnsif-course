package com.dilip.dayThreeCodes.hirerachialInheritance;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Employee e = new Employee();
		
		//Creating a Student Object		
		s.setUid(001);
		s.setName("Dilip");
		s.setAge(23);
		s.setCollege("BITM");
		s.setGender("Male");
		s.setNationality("Indian");
		s.setStream("CSE");
		s.setState("Karnataka");
		s.setCity("Ballari");
		System.out.println(s);
		
		//Creating an employee Object		
		e.setName("Mahesh");
		e.setAge(23);
		e.setGender("Male");
		e.setNationality("Indian");
		e.setState("Karnataka");
		e.setCity("Ballari");
		e.setEmpId(1425);
		e.setOrganization("Atlassian");
		e.setDesignation("Software Development Engineer");
		System.out.println(e);
	}

}
