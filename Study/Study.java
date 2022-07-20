package AccessModifier;

public class Study {
	
	private int Students;
	private String Sname;
	private String Department;
	private int Grade;
	
	
	public Study(String Sname, String Department, int Grade) {
		this.Sname = Sname;
		this.Department = Department;
		this.Grade = Grade;
		
	}
	
	public String getDepartment() {
		return this.Department;
	}
	public String Sname() {
		return this.Sname;
	}
	public int Grade() {
		return this.Grade;
	}

}