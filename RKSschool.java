package MultipalInheritance;

public class RKSschool extends SchoolName implements Unvercity {
	
	public String strSubjectName="science";
	public String strClassName="10th B";
	public void subjectName() {
		System.out.println("Subject name :"+strSubjectName);
	}
	
	public void ClassName() {
		System.out.println("Class Name:"+strClassName+strunvercityName);
	}
   public void display() {
	System.out.println("className:"+strClassName);
   }
   
   public void getRKSSchoolDetails() {
	   this.subjectName();
	   this.ClassName();
	   this.display();
   }
   }
