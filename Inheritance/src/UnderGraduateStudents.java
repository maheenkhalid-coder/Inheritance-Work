
public class UnderGraduateStudents extends Student {

	@Override
	void student(String firstName, String lastName, int rollNumber) {
		// TODO Auto-generated method stub
		super.student(firstName, lastName, rollNumber);
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



	@Override
	void details() {
		// TODO Auto-generated method stub
		super.details();
	}

}

class Freshman extends UnderGraduateStudents {

	@Override
	void student(String firstName, String lastName, int rollNumber) {
		// TODO Auto-generated method stub
		super.student(firstName, lastName, rollNumber);
	}

	@Override
	void details() {
		System.out.println("\nFresh student!!!\n");
	}

}

class Junior extends UnderGraduateStudents {

	@Override
	void student(String firstName, String lastName, int rollNumber) {
		// TODO Auto-generated method stub
		super.student(firstName, lastName, rollNumber);
	}

	@Override
	void details() {
		// TODO Auto-generated method stub
		System.out.println("\nJunior student!!!\n");

	}
}

class Senior extends UnderGraduateStudents {

	@Override
	void student(String firstName, String lastName, int rollNumber) {
		// TODO Auto-generated method stub
		super.student(firstName, lastName, rollNumber);
	}

	@Override
	void details() {
		// TODO Auto-generated method stub
		System.out.println("\nSenior student!!!\n");

	}
}
