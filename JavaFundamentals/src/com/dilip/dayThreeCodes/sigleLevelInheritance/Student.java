package com.dilip.dayThreeCodes.sigleLevelInheritance;

public class Student extends Citizen{
	private int uid;
	private String stream;
	public Student() {
		super();
		System.out.println("This is a Student object");
	}
	public Student(String name, int age, String gender, int uid, String stream) {
		super(name, age, gender);
		this.uid = uid;
		this.stream = stream;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", stream=" + stream + ", toString()=" + super.toString() + "]";
	}
	
	
}
