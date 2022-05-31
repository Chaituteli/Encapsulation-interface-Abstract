package com.vstl.oops.Abstract;

public class KrushiBankingPage extends MobileBankingPage{

	@Override
	public void dologin(String strAccountNo, String strEnterPIN) {
	
		System.out.println("Set AccountNo in MobileBanking :"+strAccountNo);
		System.out.println("Set EnterPIN in Mobile Banking :"+strEnterPIN);
	}

	@Override
	public void Details(String strFullName, String strMobileNo, String strAdharcardNo, String strPANCardNo){
		
		String firstName="";
		String Lastname="";
		String strFullName1= firstName+Lastname ;
		System.out.println("Full Name :"+strFullName1);
		
		System.out.println("Mobile No :"+strMobileNo);
		
		System.out.println("Set AccountNo in MobileBanking :"+strAdharcardNo);
		
		System.out.println("Set EnterPIN in Mobile Banking :"+strPANCardNo);
		
	}

}
