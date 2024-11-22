package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {
		ResistorDecoder r = new ResistorDecoder();
		String[] resistor0 = { "Brown", "Red", "Green", "Green" };
		System.out.println(r.decodeResistor(resistor0));
	}

}
