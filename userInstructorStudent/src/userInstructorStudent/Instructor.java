package userInstructorStudent;

public class Instructor extends User {
	String courseName;

	public Instructor() {
		
	}
	
	public Instructor(String courseName) {
		super();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}