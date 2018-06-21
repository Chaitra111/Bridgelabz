package com.bridgeit.patterns;

import com.bridgelabz.model1.Computer;
import com.bridgelabz.model1.PC;
import com.bridgelabz.model1.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String keyboard, String display, String cpu) {

		if ("PC".equalsIgnoreCase(type))
			return new PC(keyboard, display, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new Server(keyboard, display, cpu);
		return null;
	}
}
