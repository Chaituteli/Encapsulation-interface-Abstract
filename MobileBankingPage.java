package com.vstl.oops.Abstract;

public abstract class MobileBankingPage {
	
	
	public abstract void dologin(String strAccountNo,String strEnterPIN);
	
	public void verifyApplicationDisplayed() {
		
	}
	public abstract void  Details(String strFullName,String strMobileNo,String strAdharcardNo,String strPANCardNo);

	public void verifyUserDetails() {
		
	}
}
