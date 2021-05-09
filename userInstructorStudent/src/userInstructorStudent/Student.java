package userInstructorStudent;

public class Student extends User{
	private int percentageOfCompletion;
	
	public Student() {
		
	}

	public Student(int percentageOfCompletion) {
		super();
		this.percentageOfCompletion = percentageOfCompletion;
	}

	public int getPercentageOfCompletion() {
		return percentageOfCompletion;
	}

	public void setPercentageOfCompletion(int percentageOfCompletion) {
		this.percentageOfCompletion = percentageOfCompletion;
	}
}
