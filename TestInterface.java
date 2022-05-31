package com.vstl.oops.Interface;

public class TestInterface {

	public static void main(String[] args) {
		
		 UKMedical objUKMedical =new  IndiaMedical();
		 System.out.println("strServices:"+objUKMedical.strServices);
		 objUKMedical.doCountry();
		 objUKMedical.doDoctorsDetails("Sunil Modi","Orthopedic","MD");;
	
	
	 UKMedical objUKMedical1 =new   USMedical();
	 System.out.println("strServices:"+objUKMedical1.strServices);
	 objUKMedical1.doCountry();
	 objUKMedical1.doDoctorsDetails("Aniket Teli", "Physio", "MBBS");

}
}

