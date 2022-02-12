package com.techstack.parthshah.javabasics.java9To18features;

interface sports {
	void play();
}

record Badminton(String name,int points) implements sports {

	@Override
	public void play() {
		System.out.println("Play the game");		
	}
	
	
}
public class record_Demo {

	
	record Emp(String name,String emailId,Integer phone) {
		//can have static variables
		static String message="This is default msg in record";
		
		Emp(String name,String emailId,Integer phone){
			this.name = name;
			this.emailId=emailId;
			this.phone=phone;
		}
		
		//can have multiple constructors
		Emp(String name){
			this(name,null,null);
		}
		
		//can have static methods
		public static String getMsg_Static() {
			return message + ", Hello custom message";
		}
		
		public String getMsg_nonStatic() {
			return message + ", Hello custom message";
		}
	}
	
	public static void main(String[] args) {
		System.out.println("========welcome to records in JDk-16 ===============================================================");
		Emp objRecord = new Emp("Parth", "parth.shah2084@gmail.com",11111);
		Emp objRecord2 = new Emp("Parth", "parth.shah2084@gmail.com",11111);
		Emp objRecord3 = new Emp("Vihu", "parth.shah2084@gmail.com",11111);
		
		System.out.println(objRecord);
		System.out.println("-----Equals method in record ----------------------------------------------");
		System.out.println("Inbuilt equals compares using value-: " + objRecord.equals(objRecord2));
		System.out.println("Inbuilt equals compares using value-: " + objRecord.equals(objRecord3));
		System.out.println("objRecord.name = AA is not possible as all fields are final,cant modify ");
	//	objRecord.name = "AA";
		System.out.println(objRecord.phone());
		System.out.println(objRecord);
		System.out.println("-----Access static varaibel in record ----------------------------------------------");
		System.out.println(objRecord.getMsg_Static());
		System.out.println(Emp.getMsg_Static());
		
		System.out.println(Emp.getMsg_Static());
		
		System.out.println("=======================================================================");
		System.out.println("---------Records implement interface demo--------------------");
		Badminton bd = new Badminton("P V Sindhu", 21);
		System.out.println("---------invoke interface method - play ---------------");
		bd.play();
		
		System.out.println("---------invoke java.lang.Class new method-isRecord() ---------------");
		//new method in java.lang.Class to identify if its record or not?
		System.out.println("Badminton is record ? -: " +bd.getClass().isRecord());
		
	}

}




