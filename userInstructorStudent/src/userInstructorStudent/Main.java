package userInstructorStudent;

public class Main {

	public static void main(String[] args) {
		
		Student firstStudent = new Student();
		firstStudent.setFirstName("Buket");
		firstStudent.setLastName("Alt�n");
		
		Instructor firstInstructor = new Instructor();
		firstInstructor.setFirstName("Engin");
		firstInstructor.setLastName("Demiro�");
		
		User[] users = {firstStudent, firstInstructor};
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		
		StudentManager studentManager = new StudentManager();
		studentManager.uploadHW(firstStudent);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.gradeHW(firstInstructor, 80);
	
	}
}
