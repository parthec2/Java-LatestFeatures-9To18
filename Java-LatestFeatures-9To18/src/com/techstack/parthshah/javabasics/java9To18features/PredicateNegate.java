package com.techstack.parthshah.javabasics.java9To18features;

import java.util.List;
import java.util.function.Predicate;


public class PredicateNegate {

	public static void main(String[] args) {
		System.out.println("IMP NOTE- RUN with JAva 11 JDK");
		Predicate<Integer> evenNum =  num -> num % 2== 0;
		List<Integer> lstInt = List.of(2,4,888,999,1,777);
		System.out.println("=====List Integer==============================");
		lstInt.stream().forEach(x-> System.out.println(x));
		
		System.out.println("=====Printing Even numbers==============================");
		lstInt.stream().filter(evenNum).forEach(x-> System.out.println(x));
		
		System.out.println("=====Printing Odd numbers==============================");
		lstInt.stream().filter(evenNum.negate()).forEach(x-> System.out.println(x));
		
		System.out.println("=====Printing Odd numbers with method ref-Java 11 ==============================");
		lstInt.stream().filter(Predicate.not(PredicateNegate::filterOddNum)).forEach(x-> System.out.println(x));
		
	}
	
	static boolean filterOddNum(Integer i) {
		return i%2==0;
	}

}


