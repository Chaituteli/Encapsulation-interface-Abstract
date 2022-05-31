package MultipalInheritance;

public class SchoolName {

	public String strschool="CBSC school in Kolhapure";
	public int inttotalstudent=590;
	
	public void SchoolName() {
		System.out.println("School Name:"+ strschool);
	}
	
	public void schoolStrength() {
		System.out.println("Strength of school:"+inttotalstudent);
	}

   public void getDetalis() {
	   this.SchoolName();
	   this.schoolStrength();
   }



}
