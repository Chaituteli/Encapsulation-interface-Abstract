package com.vstl.oops.Interface;

public class USMedical implements  UKMedical {
	String strName= "Aniket Teli";
	String strSpecilist="Physio";
	String strEducation="MBBS";
	
	@Override
	public void doCountry() {
		System.out.println("USMedical ");
     }

	
	@Override
	public void doDoctorsDetails(String strDoctorsName, String strDocterSpecilist, String strEducation) {
		strName=strDoctorsName;
		 strSpecilist= strDocterSpecilist;
		strEducation=strEducation;
		
		System.out.println("Doctors Name:"+strName);
		System.out.println("Specilist :"+strSpecilist);
		System.out.println("Degree:"+strEducation);
	}


		
}

