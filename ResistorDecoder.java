package edu.sbcc.cs105;


import java.util.*;

public class ResistorDecoder {
	public String firstBand;
	public String secondBand;
	public String thirdBand;
	public String fourthBand;
	public String finalDecodedResistorNum;

	public String  decodeResistor(String[] resistorColors) { 
		
		firstBand = resistorColors[0];
		secondBand = resistorColors[1];
		thirdBand = resistorColors[2];
		fourthBand = resistorColors[3];
		
		NumberLookup nL = new NumberLookup();
		
		ToleranceLookup tL = new ToleranceLookup();
				
		
		String output = (nL.getNumericValue(firstBand, secondBand, thirdBand)) + ", ±" + tL.getTolerance(fourthBand) +"%";
		
		return output;

	}
	
}