package com.vstl.oops.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Instagram objInstagram = new Instagram ();
		
		
		objInstagram.setStrURL("https://www.instagram.com/accounts/emailsignup/?hl=en");
		System.out.println(" get URl:"+objInstagram.getStrURL());
		
		objInstagram.setStrUserName("Advet$123");
		System.out.println("User Name:"+objInstagram.getStrUserName());
		
		objInstagram.setStrPassword("Advets456");
		System.out.println("Password:"+objInstagram.getStrPassword());
		
		objInstagram.setStrDateofBirth("4 Dec 1995");
		System.out.println("Date of Birth:"+objInstagram.getStrDateofBirth());
		
		objInstagram.setStrPlace("Kolhapur");
		System.out.println("Place :"+objInstagram.getStrPlace());
		
		objInstagram.setStrEmailId("Advetpatil@345Gmail.com");
		System.out.println("Get Email ID :"+objInstagram.getStrEmailId());
		
		
		
		

	}

}
