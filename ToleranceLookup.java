	package edu.sbcc.cs105;
	import java.util.*;
	import java.util.Dictionary;


	public class ToleranceLookup {
		
		public int tolerance;
		public String toleranceString;
		double toleranceNum;
		
		public String getTolerance(String color) {
			
			
			if(color == "Brown") {
				toleranceNum = 10.0;
			}else if(color == "Red") {
				toleranceNum = 20.0;
			}else if(color == "Yellow") {
				toleranceNum = 50.0;
			}else if(color == "Green") {
				toleranceNum = 5.0;
			}else if(color == "Blue") {
				toleranceNum = 2.5;
			}else if(color == "Violet") {
				toleranceNum = 1.0;
			}else if(color == "Gray") {
				toleranceNum = 100.0;
			}else if(color == "Gold") {
				toleranceNum = 50.0;
			}else if(color == "Silver") {
				toleranceNum = 100.0;
			}else if(color == "None") {
				toleranceNum = 200.0;
			}
			
			double trueTolerance = (toleranceNum / 10.0);
			
			if(trueTolerance % 1 ==0) {
				int trueToleranceInt = (int)trueTolerance;
				toleranceString = Integer.toString(trueToleranceInt);
			}
			else {
				toleranceString = Double.toString(trueTolerance);
				
			}
		
			return toleranceString;	
		}
	}
