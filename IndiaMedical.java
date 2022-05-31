package com.vstl.oops.Interface;

public class IndiaMedical implements  UKMedical{
	String strName= "Sunil Modi";
	String strSpecilist="Orthopedic";
	String strEducation="MD";
	
	@Override
	public void doCountry() {
		System.out.println(" IndiaMedical");
		
		
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
