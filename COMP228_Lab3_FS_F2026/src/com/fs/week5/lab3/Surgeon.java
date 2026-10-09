package com.fs.week5.lab3;

public class Surgeon extends Doctor {
	
	
	private int operatingRoom;
	private String surgeryType;
	
	
	public Surgeon(int personId, String name, int age, String specialization, double consultationFee, String surgeryType, int operatingRoom) {
		super(personId, name, age, specialization, consultationFee);
		this.surgeryType = surgeryType;
		this.operatingRoom = operatingRoom;
	}
	
	public void performSurgery() {
		
		System.out.println("Performs " + surgeryType + " in operating room: " + operatingRoom + "\n");
	}
	@Override
	public void performDuties() {
		
		System.out.println("As a " + getSpecialization() + " performs surgical duties for $" + getConsultationFee() + " per hour");
		
	}
	

}
