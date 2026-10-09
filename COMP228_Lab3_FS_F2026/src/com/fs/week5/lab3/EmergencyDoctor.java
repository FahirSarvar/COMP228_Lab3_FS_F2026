package com.fs.week5.lab3;

public class EmergencyDoctor extends Doctor implements Billable, MedicalProfessional {
	
	
	
	public EmergencyDoctor(int personId, String name, int age, String specialization, double consultationFee) {
		super(personId, name, age, specialization, consultationFee);
	}

	public void handleEmergency() {
		System.out.println("Examines and treats patients in order to save their lives as soon as possible.");
			
		}
	@Override
	public void generateBill() {
		
		double bill = getConsultationFee() * 3;
		System.out.printf("The total bill is $%.2f%n", bill);
	}
	@Override
	public void prescribeMedication() {
		
		System.out.println("After examination doctor prescribed ibuprofen for the patient");
	}
	@Override
	public void performDuties() {

		System.out.println("As an " + getSpecialization() + " provides solutions and treats patients for $" + getConsultationFee() + " per hour");
	}

}
