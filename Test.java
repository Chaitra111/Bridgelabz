package com.bridgeit.patterns;

import com.bridgelabz.model1.Computer;

public class Test {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "Logitech", "1280*800", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "casio", "1900*1000", "2.9 GHz");
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}
