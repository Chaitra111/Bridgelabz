package com.bridgelabz.Clinique;

public interface ManagerService {

	// Add doctor details
	public void addDocotor();

	public void updateDocotorDetails(int doctorId);

	public void deleteDoctor(int doctorId);

	// Add Patient details
	public void addPatient();

	public void updatePatientByAge(int patientId);

	public void deletePatient(int patientId);
}
