package edu.sbcc.cs105;

import java.util.Dictionary;

import java.util.Hashtable;

public class Multiplier {
private String multiplierString;

	

	public int getMultiplier(String color) {


		if(color.equals("Silver")) {

			 multiplierString = "1";

		} else if(color == "Gold") {
			multiplierString = "1";
		}else if(color == "Black") {
			multiplierString = "1";
		}else if(color == "Brown") {
			multiplierString = "10";
		}else if(color == "Red") {
			multiplierString = "100";
		}else if(color == "Orange") {
			multiplierString = "1000";
		}else if(color == "Yellow") {
			multiplierString = "10000";
		}else if(color == "Green") {
			multiplierString = "100000";
		}else if(color == "Blue") {
			multiplierString = "1000000";
		}else if(color == "Violet") {
			multiplierString = "10000000";
		}else if(color == "Gray") {
			multiplierString = "100000000";
		}else if(color == "White") {
			multiplierString = "1000000000";
		}

		

		

		int multiplierInt = Integer.valueOf(multiplierString);

		return multiplierInt;

	}


}
