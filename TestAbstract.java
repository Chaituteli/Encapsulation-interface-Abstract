package com.vstl.oops.Abstract;

public class TestAbstract {

	public static void main(String[] args) {
		
		Pagefactory.getobjMobileBankingPage().dologin("3546100000675"," 9254");
		
		Pagefactory.getobjMobileBankingPage().verifyApplicationDisplayed();
		
		Pagefactory.getobjMobileBankingPageDetails().Details("Anil Shinde"," 9594149071", "4563 675 456", "FC453G12");
		
		Pagefactory.getobjMobileBankingPageDetails().verifyUserDetails();
	}

}
