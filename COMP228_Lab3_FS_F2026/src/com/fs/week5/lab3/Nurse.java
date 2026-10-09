package com.fs.week5.lab3;

public class Nurse extends Person{
	
	private String shift;
	private String department;
	
	
	
	public Nurse(int personId, String name, int age, String department, String shift) {
		super(personId, name, age);
		this.department = department;
		this.shift = shift;
	}
	
	public void assistPatient() {
		
		System.out.println("Helps and takes care of patients");
		
	}
	@Override
	public void performDuties() {
		
		System.out.println("Provides nursing care at " + department + " department during "+shift+" shift" );

	}
	
	
	

}
