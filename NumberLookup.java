package edu.sbcc.cs105;
import java.util.Dictionary;
import java.util.Hashtable;

public class NumberLookup {
private String finalDecodedResistorNum;
	
	public String getNumericValue(String color1, String color2, String color3) {

		String decodedResistorNumValue = "";
		
		Multiplier m = new Multiplier(); 
		int multInt = m.getMultiplier(color3); 
		
		LookupTable lt = new LookupTable();
		int num1 = lt.getDouble(color1);
		int num2 = lt.getDouble(color2);
		String sN1 = Integer.toString(num1);
		String sN2 = Integer.toString(num2);
		String actualNum = sN1 + sN2;

		int realVal = Integer.valueOf(actualNum);
		
		int finalNumber = realVal * multInt;
		
		if(multInt >=0) {
			decodedResistorNumValue = Integer.toString(finalNumber);
			finalDecodedResistorNum = decodedResistorNumValue + "Ω";
		}

		if(multInt >= 100 && multInt <= 10000) {
			double finalNumberDouble = finalNumber / 1000.0;
			
			if(finalNumberDouble % 1 == 0) {
				int finalNumberInt = (int)finalNumberDouble;
				decodedResistorNumValue = Integer.toString(finalNumberInt);
			}
			else {
				decodedResistorNumValue = Double.toString(finalNumberDouble);
			}
			
			finalDecodedResistorNum = decodedResistorNumValue + "KΩ";
		}
		
		if(multInt > 10000) {
			
			double finalNumberDouble = finalNumber / 1000000.0;
			
			if(finalNumberDouble % 1 == 0) {
				int finalNumberInt = (int)finalNumberDouble;
				decodedResistorNumValue = Integer.toString(finalNumberInt);
			}
			
			else {
				decodedResistorNumValue = Double.toString(finalNumberDouble);
			}
			
			finalDecodedResistorNum = decodedResistorNumValue + "MΩ";
		}
		
		return finalDecodedResistorNum;	
	}

}
