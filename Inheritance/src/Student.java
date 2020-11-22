
public class Student {
	private String _firstName = "";
	private String _lastName = "";
	private int _rollNumber;

	void student(String firstName, String lastName, int rollNumber) {

		_firstName = firstName;
		_lastName = lastName;
		_rollNumber = rollNumber;
	}
	
	void details() {
				
	}
	
	public String toString() {
        return "Name: "+this._firstName+" "+this._lastName+ "\nRoll Number: " +this._rollNumber;
    }

}
