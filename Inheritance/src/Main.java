
public class Main {
	
	 static void StudentData() {
		 
		 System.out.println("\n\t\tUnder Graduate Students\n\n");

			UnderGraduateStudents obj = new Freshman();
			UnderGraduateStudents obj1 = new Senior();
			UnderGraduateStudents obj2 = new Junior();

			obj.student("Ahmar", "Khan", 45);
			System.out.println(obj.toString());
			System.out.println("\n\tStudent Detail");
			obj.details();

			obj.student("Ali", "Khan", 21);
			System.out.println(obj.toString());
			System.out.println("\n\tStudent Detail");
			obj1.details();

			obj.student("Zohaib", "Ahsan", 75);
			System.out.println(obj.toString());

			System.out.println("\n\tStudent Detail");
			obj2.details();

			System.out.println("\n\t\tGraduate Students\n\n");

			GraduateStudents std = new DoctoralStudent();
			GraduateStudents std1 = new MastersStudent();

			std.student("Sheriyar", "Ali", 22);
			System.out.println(obj.toString());
			System.out.println("\n\tStudent Detail");
			std.details();

			std1.student("Amna", "Faizan", 98);
			System.out.println(obj.toString());
			System.out.println("\n\tStudent Detail");
			std1.details();

		
	}

	public static void main(String[] args) {
		
		StudentData();


	}

}
