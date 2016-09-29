public class Student {
	private String fname;
	private String lname;
   private String email;
	private double gpa;
	public Student (String st_fname, String st_lname, String st_email, double st_gpa)
	{
		fname =st_fname;
      lname =st_lname;
		email = st_email;
		gpa = st_gpa;
		
	}
	public String getfName() {
		return fname;
	}

	public void setfName(String fname) {
		this.fname = fname;
	}
	
	public String getlName() {
		return lname;
	}
	
	public void setlName(String lname) {
		this.lname = lname;
	}
   
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	public void Display ()
	{
		 System.out.println( " First Name : "+ getfName()+ " Last Name : "+
		           getlName()+"\nEmail : "+getEmail()+"\nGpa :"+getGpa());
	}
	

}