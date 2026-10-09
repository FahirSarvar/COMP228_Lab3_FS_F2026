package com.fs.week5.lab3;

public class MainDriver {

	public static void main(String[] args) {
		
		
		Doctor doctor = new Doctor(1, "Bob", 47, "cardiologist", 49.99);
		
		Nurse nurse = new Nurse(2,"Alice", 35, "Intensive Care", "night");
		
		Surgeon surgeon = new Surgeon(3, "John", 39, "neurosurgeon", 200, "brain surgery", 10 );
		
		EmergencyDoctor emergencyDoctor = new EmergencyDoctor(4, "Walter", 35, "Emergency Doctor", 70.99);
		
		System.out.println("----- Doctor -----");
		System.out.println("Person ID: "+ doctor.getPersonId());
		System.out.println("Name: "+ doctor.getName());
		System.out.println("Age: "+ doctor.getAge());
		doctor.diagnosePatient();
		doctor.performDuties();
		System.out.println("\n");
		
		System.out.println("----- Nurse -----");
		System.out.println("Person ID: "+ nurse.getPersonId());
		System.out.println("Name: "+ nurse.getName());
		System.out.println("Age: "+ nurse.getAge());
		nurse.assistPatient();
		nurse.performDuties();
		System.out.println("\n");
		
		System.out.println("----- Surgeon -----");
		System.out.println("Person ID: "+ surgeon.getPersonId());
		System.out.println("Name: "+ surgeon.getName());
		System.out.println("Age: "+ surgeon.getAge());
		surgeon.performSurgery();
		surgeon.performDuties();
		System.out.println("\n");
		
		System.out.println("----- EmergencyDoctor -----");
		System.out.println("Person ID: "+ emergencyDoctor.getPersonId());
		System.out.println("Name: "+ emergencyDoctor.getName());
		System.out.println("Age: "+ emergencyDoctor.getAge());
		emergencyDoctor.handleEmergency();
		emergencyDoctor.generateBill();
		emergencyDoctor.prescribeMedication();
		emergencyDoctor.performDuties();
		System.out.println("\n");
		
		
		System.out.println("----- Polymorphism -----");
		Person person;
		person = doctor;
		person.performDuties();
		person = nurse;
		person.performDuties();
		person = surgeon;
		person.performDuties();
		person = emergencyDoctor;
		person.performDuties();
		System.out.println("\n");
		
		System.out.println("----- Polymorphism with loop -----");
		
		Person[] staff = new Person[4];
		
		staff[0] = doctor;
		staff[1] = nurse;
		staff[2] = surgeon;
		staff[3] = emergencyDoctor;
		
		for (int i = 0; i < staff.length; i++) {
			staff[i].performDuties();
			
		}
		
		
		
		
		

	}

}
