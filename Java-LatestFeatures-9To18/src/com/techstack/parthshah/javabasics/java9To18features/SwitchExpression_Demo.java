package com.techstack.parthshah.javabasics.java9To18features;

public class SwitchExpression_Demo {

	public static void main(String[] args) {
		
		System.out.println("======Demo of SwitchExpression method introduce in Java SE 14================================================");
		System.out.println("-----------Invoke switch legacy way--------------------------");
		System.out.println(getMonthNameByLegacyWay(2));
		System.out.println("-----------Invoke switch expression--------------------------");
		System.out.println(getMonthNameBySwitchexpression(1));
		System.out.println(getMonthNameBySwitchexpression(0));
		System.out.println(getMonthNameBySwitchexpression(13));
		System.out.println("-----Invoke default in swithc expression----------------------");
		System.out.println(getMonthNameBySwitchexpression(14));
		
	}

	static String getMonthNameByLegacyWay(int i) {
		String monthName="";
		
		switch (i) {
		case 1:
			monthName = "January";
			break;

		case 2:
			monthName = "February";
			break;

		case 3:
			monthName = "March";
			break;

		case 4:
			monthName = "April";
			break;

		case 12:
			monthName = "December";
			break;

		default:
			break;
		}
		
		return monthName;
	}
		
	public static String getMonthNameBySwitchexpression(int i) {
		String monthName= switch(i) {
		case 1 -> {
			System.out.println("Some logic... than yield value is");
			yield "January";
		}		
		case 2 -> "February";
		case 3 -> "March";
		case 0,13 -> "Incorrect month";
		default -> "December";
		};
		
		return monthName;
	}

}


