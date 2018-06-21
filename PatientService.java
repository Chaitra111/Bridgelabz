package com.bridgelabz.Clinique;

public interface PatientService {

	public void takeAppointment();

	public void showPatientDetails();

	public void searchPatientByName(String patientName);

	public void searchPatientById(int patientId);

	public void searchPatientByMobileNumber(long mobileNumber);

	public void showPopularDoctor();
}
