package userInstructorStudent;

public class InstructorManager {
	public void gradeHW(Instructor instructor, int grade) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " ödeve "
				+ grade + " verdi.");
	}

}
