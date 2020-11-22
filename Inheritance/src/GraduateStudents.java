
public class GraduateStudents extends Student {

	@Override
	void student(String firstName, String lastName, int rollNumber) {
		// TODO Auto-generated method stub
		super.student(firstName, lastName, rollNumber);
	}

	@Override
	void details() {
		// TODO Auto-generated method stub
		super.details();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}

class DoctoralStudent extends GraduateStudents {

	@Override
	void student(String firstName, String lastName, int rollNumber) {
		// TODO Auto-generated method stub
		super.student(firstName, lastName, rollNumber);
	}

	@Override
	void details() {
		// TODO Auto-generated method stub
		System.out.println("\nDoctoral student!!!\n");

	}

}

class MastersStudent extends GraduateStudents {
	@Override
	void student(String firstName, String lastName, int rollNumber) {
		// TODO Auto-generated method stub
		super.student(firstName, lastName, rollNumber);
	}

	@Override
	void details() {
		// TODO Auto-generated method stub
		System.out.println("\nMasters Student!!!\n");
	}
}
