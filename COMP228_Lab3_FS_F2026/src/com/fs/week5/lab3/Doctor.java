package com.fs.week5.lab3;

public class Doctor extends Person {
	
	private double consultationFee;
	private String specialization;
	
	public double getConsultationFee() {
		return consultationFee;
	}

	public String getSpecialization() {
		return specialization;
	}

	

	public Doctor(int personId, String name, int age, String specialization, double consultationFee) {
		super(personId, name, age);
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}

	public void diagnosePatient() {
		
		System.out.println("Examines patients");

	}

	@Override
	public void performDuties() {
		System.out.println("As a " + specialization + " provides solutions to solve patient's issue for $" + consultationFee + " per appointment");

	}

}
