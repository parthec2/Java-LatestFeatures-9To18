package com.techstack.parthshah.javabasics.java9To18features;

import java.util.HashMap;
import java.util.Map;

public class copyOf_Demo {

	public static void main(String[] args) {
		
		System.out.println("======Demo of copyOf method-Java SE10================================================");
		Map<String,String> hMap = new HashMap<>();
		hMap.put("Captain", "Rohit Sharma");
		hMap.put("WicketKepper", "Risabh Pant");
		hMap.put("ViceCaptain", "Virat");
//		updateMap(hMap);
//		hMap.entrySet().stream().forEach(x-> System.out.println("Key-: "+ x.getKey()+ ", Value-:"+ x.getValue()));
		Map<String, String> copyOfhMap = Map.copyOf(hMap);
		updateMap(copyOfhMap);//throws exception-UnSupportedException on ImmutableCollections copyOfhMap
		
		System.out.println("---Printing copyOfMap Map values ----------------------------------------------");
		copyOfhMap.entrySet().stream().forEach(x-> System.out.println("Key-: "+ x.getKey()+ ", Value-:"+ x.getValue()));
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("======Demo of List.of method-Java SE10================================================");
		
		//Map.of, List.of,Arrays,of		
		Map<String,String> hStaticMap = Map.of("Captain", "Ganguly",
											   "WicketKepper", "Dhoni",
											   "ViceCaptain", "Sachin");
		hStaticMap.entrySet().stream().forEach(x-> System.out.println("Key-: "+ x.getKey()+ ", Value-: "+ x.getValue()));
		
	}

	static void updateMap(Map<String,String> hMap2) {
		try {
			hMap2.put("Captain", "Risabh Pant");	
		}catch(Exception e) {
			System.out.println("------------------------------------------------------------------------------");
			//System.out.println("Exception in updateMap method as below-: ");
			e.printStackTrace();
			System.out.println("------------------------------------------------------------------------------");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				//Do nothing
			}
			
			
		}
		
	}
}


