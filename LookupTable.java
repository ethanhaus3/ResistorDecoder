package edu.sbcc.cs105;
import java.util.*;

public class LookupTable {
	int num;
	public int getDouble(String color) {
		
		
		if(color == "Black") {
			num = 0;
		}else if(color == "Brown") {
			num = 1;
		}else if(color == "Red") {
			num = 2;
		}else if(color == "Orange") {
			num = 3;
		}else if(color == "Yellow") {
			num = 4;
		}else if(color == "Green") {
			num = 5;
		}else if(color == "Blue") {
			num = 6;
		}else if(color == "Violet") {
			num = 7;
		}else if(color == "Gray") {
			num = 8;
		}else if(color == "White") {
			num = 9;
		}
		
		return num;
	}
		
}
