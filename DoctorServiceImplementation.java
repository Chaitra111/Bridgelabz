package com.bridgelabz.Clinique;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DoctorServiceImplementation {

	public ArrayList<Doctor> doctorList = new ArrayList<>();
	Utility utility = new Utility();
	File file = new File("/home/bridgeit/Documents/Docs/Doctor.json");

	public void showDoctorDetails() {

		try {
			doctorList = Utility.parseJSONArray(file, Doctor.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < doctorList.size(); i++) {

			try {
				System.out.println(Utility.mapper.writerWithDefaultPrettyPrinter()
						.writeValueAsString(doctorList.get(i).toString()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean searchByDoctorName(String doctorName) {
		try {
			doctorList = Utility.parseJSONArray(file, Doctor.class);

		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean search = false;

		for (int i = 0; i < doctorList.size(); i++) {
			if (doctorList.get(i).getDoctorName().equalsIgnoreCase(doctorName)) {
				System.out.println("Doctor available ");
				search = true;
				break;
			}
		}
		if (!search) {
			System.out.println("Doctor not Available");
			return search;
		}
		return search;
	}

	public void searchByDoctorId(int doctorId) {
		try {
			doctorList = Utility.parseJSONArray(file, Doctor.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		boolean search = false;
		for (int i = 0; i < doctorList.size(); i++) {
			if (doctorList.get(i).getDoctorId() == (doctorId)) {
				System.out.println("Doctor available ");
				search = true;
			}
		}
		if (!search) {
			System.out.println("Doctor not Available");
		}

	}

	public void searchBySpecialization(String specialization) {
		try {
			doctorList = Utility.parseJSONArray(file, Doctor.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		boolean search = false;
		for (int i = 0; i < doctorList.size(); i++) {
			if (doctorList.get(i).getSpecialization().equalsIgnoreCase(specialization)) {
				System.out.println("Doctor available ");
				search = true;
			}
		}
		if (!search) {
			System.out.println("Doctor not Available");
		}

	}
}