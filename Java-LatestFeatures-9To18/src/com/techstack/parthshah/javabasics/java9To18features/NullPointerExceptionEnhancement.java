package com.techstack.parthshah.javabasics.java9To18features;

public class NullPointerExceptionEnhancement {

	public static void main(String[] args) {
		Address objAdd= new Address("Nr Reliance smart","behing raddinson hotel","Pune", "222333");
		objAdd.setCity(null);
		Company objComp = new Company("Parth Shah", objAdd);

		System.out.println("objComp.getEmpAddress().getCity() is NULL"); 
		
		/*Before JDK-14
		 Exception in thread "main" java.lang.NullPointerException at method name(Filename.java)
		/*New msg in JDK-14
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because the return value of
"com.techstack.parthshah.javabasics.java9To17features.Address.getCity()" is null
at com.techstack.parthshah.javabasics.java9To17features.NullPointerExceptionEnhancement.main(NullPointerExceptionEnhancement.java:22)
		*/

		//City is null--it clearly shows getEmpAddress().getCity()
		//System.out.println(objComp.getEmpAddress().getCity().toString());

		//Address obj is null-it clearly show getEmpAddress is null
		objComp.setEmpAddress(null);
		System.out.println(objComp.getEmpAddress().getCity().toString());

		System.out.println("=====================================================================================");
		System.out.println("objComp.getEmpAddress() is NULL");
		/*
Exception in thread "main" java.lang.NullPointerException: 
Cannot invoke "com.techstack.parthshah.javabasics.java9To17features.Address.getCity()" 
because the return value of "com.techstack.parthshah.javabasics.java9To17features.Company.getEmpAddress()" is null
at com.techstack.parthshah.javabasics.java9To17features.NullPointerExceptionEnhancement.main(NullPointerExceptionEnhancement.java:35)
*/
		Company objComp2222 = new Company("Parth Shah", null);
		System.out.println(objComp2222.getEmpAddress().getCity().toString());
	}

}

class Company {
	
	public Company(String empName, Address empAddress) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	private String empName;
	private Address empAddress;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	
}

class Address {
	
	public Address(String line1, String line2, String city, String pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.pincode = pincode;
	}
	private String line1;
	private String line2;
	private String city;
	private String pincode;
	
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}


