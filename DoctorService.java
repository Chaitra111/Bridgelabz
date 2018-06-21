package com.bridgelabz.Clinique;

public interface DoctorService {
	
	// Show the doctor details
	public void showDoctorDetails();

	public boolean searchByDoctorName(String docotorName);

	public void searchByDoctorId(int doctorId);

	public void searchBySpecialization(String specialization);
}
