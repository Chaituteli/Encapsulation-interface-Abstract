package com.vstl.oops.Abstract;



public class Pagefactory {
	
	public static MobileBankingPage objMobileBankingPage=null;
	
	public static String ApplicationDisplayed="PhonePay";
	
	public static  MobileBankingPage getobjMobileBankingPage() {
		if (ApplicationDisplayed.equals("PhonePay")) {
			objMobileBankingPage=new PhonePayPage();
		}else if ( ApplicationDisplayed.equals("KrushiBanking")) {
			objMobileBankingPage=new KrushiBankingPage();
			
		}
	    return objMobileBankingPage;
	}
	
	public static String UserDetails="PhonePay";
	
	public static  MobileBankingPage getobjMobileBankingPageDetails() {
		if (UserDetails.equals("PhonePay")) {
			objMobileBankingPage=new PhonePayPage();
		}else if ( UserDetails.equals("KrushiBanking")) {
			objMobileBankingPage=new KrushiBankingPage();
			
		}
		return objMobileBankingPage;
	    

}
}