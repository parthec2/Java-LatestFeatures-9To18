package com.techstack.parthshah.javabasics.java9To18features;

public class StringUtilityDemo {

	public static void main(String[] args) {
		System.out.println("  ".isBlank());
		
		System.out.println(" AAAA ".stripLeading().replace(" ", "#"));
		System.out.println(" AAAA ".stripTrailing().replace(" ", "#"));//Jdk11
		"L1\n L22222 22\n L33333".lines().forEach(x->System.out.println(x));//Jdk11,lines return stream<String>
		
		System.out.println("HELLO".transform(x->x.toLowerCase()));//JDK12
		
		System.out.println("My fav game is %s,%s,I won %d trophies".formatted("Table Tennis","Badminton",2));//JDK-15
		
	}

}


