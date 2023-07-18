package com.dilip.dayThreeCodes.hirerachialInheritance;

public class Student extends Person {
	private int uid;
	private String College;
	private String stream;

	public Student(String name, int age, String nationality, String state, String city, String gender, int uid,
			String college, String stream) {
		super(name, age, nationality, state, city, gender);
		this.uid = uid;
		College = college;
		this.stream = stream;
	}

	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("This is a Student object!");
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [uid=" + uid + ", College=" + College + ", stream=" + stream + ", toString()="
				+ super.toString() + "]";
	}

}
